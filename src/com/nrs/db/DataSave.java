package com.nrs.db;

public class DataSave {

	private String count;
	private String Data;
	private String sum;
	private String sub;
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "DataSave [count=" + count + ", Data=" + Data + ", sum=" + sum + ", sub=" + sub + "]";
	}
	
}
