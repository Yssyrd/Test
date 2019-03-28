package com.nrs.db;



import java.io.BufferedWriter;
import java.io.IOException;

import com.google.gson.Gson;

import redis.clients.jedis.Jedis;

public class DataProcessing {

	public String DataStr(String str,Jedis jedis,BufferedWriter txt) throws IOException{
		if(str.substring(0, 2).equals("aa")&&str.substring(8,10).equals("bb")){
			if(str.length() == 8202){
				txt.write(str);
				txt.newLine();
				System.out.println(str);
				str = "";
			}
			if(str.length()>8202){
				str = "";
			}
		}else{
			str = "";
		}
		return str;
		
	}
	
	public void DataSplit(String str,Jedis jedis){
		String marker = str.substring(0,4);
		if(marker.equals("aaff")){
			SetData(str.substring(6,16),jedis);
		}
		
	}
	
	public void SetData(String str,Jedis jedis){
		
		String marker = str.substring(0,2);
		String number = DataTranfer(str.substring(2,10));
		
		switch (marker) {
			case "da":
				jedis.set("aNoneSide",PushData(jedis.get("aNoneSide"),number));
				break;
				
			case "01":
				jedis.set("aFontSide",PushData(jedis.get("aFontSide"),number));
				break;
				
			case "02":
				jedis.set("aBackSide",PushData(jedis.get("aBackSide"),number));
				break;
				
			case "03":
				jedis.set("aLeftSide",PushData(jedis.get("aLeftSide"),number));
				break;
				
			case "04":
				jedis.set("aRightSide",PushData(jedis.get("aRightSide"),number));
				break;
				
			case "db":
				jedis.set("bNoneSide",PushData(jedis.get("bNoneSide"),number));
				break;
				
			case "05":
				jedis.set("bFontSide",PushData(jedis.get("bFontSide"),number));
				
				System.out.println(jedis.get("bFontSide"));
				break;
				
			case "06":
				jedis.set("bBackSide",PushData(jedis.get("bBackSide"),number));
				break;
				
			case "07":
				jedis.set("bLeftSide",PushData(jedis.get("bLeftSide"),number));
				break;
				
			case "08":
				jedis.set("bRightSide",PushData(jedis.get("bRightSide"),number));
				break;
		}
		
	}
	public String DataTranfer(String str){
		
		String result = str.substring(6,8)+str.substring(4,6)+str.substring(2,4)+str.substring(0,2);
		result = String.valueOf(Integer.parseInt(result, 16));
		return result;
	}
	
	public void InitData(Jedis jedis){
		
		Gson gson = new Gson();
		DataSave save = new DataSave();
		save.setCount("0");
		save.setData("0");
		save.setSum("0");
		save.setSub("10000");
		String objectStr = gson.toJson(save);
		jedis.set("aNoneSide", objectStr);
		jedis.set("aFontSide", objectStr);
		jedis.set("aBackSide", objectStr);
		jedis.set("aLeftSide", objectStr);
		jedis.set("aRightSide", objectStr);
		jedis.set("bNoneSide", objectStr);
		jedis.set("bFontSide", objectStr);
		jedis.set("bBackSide", objectStr);
		jedis.set("bLeftSide", objectStr);
		jedis.set("bRightSide", objectStr);
		
	}
	
	public String PushData(String Str,String num){
		
		Gson gson = new Gson();
		DataSave dataSave =  gson.fromJson(Str,DataSave.class);
		
		Integer count = Integer.valueOf(dataSave.getCount())+1;
		Long sum = Long.valueOf(dataSave.getSum())+ Long.valueOf(num);
		dataSave.setCount(count.toString());
		dataSave.setSum(sum.toString());
		dataSave.setData(num);
		return gson.toJson(dataSave);
	}
	
}
