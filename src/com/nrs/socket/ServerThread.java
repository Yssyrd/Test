package com.nrs.socket;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;

import com.nrs.db.DataProcessing;

import redis.clients.jedis.Jedis;

/**
 * @author 杨润东
 *
 * @date: 2018年6月26日 下午4:21:02
 */
public class ServerThread implements Runnable {  
	
	private static DataProcessing dp =new DataProcessing();
    private Socket client = null;  
    private static final char[] HEX_CHAR = {'0', '1', '2', '3', '4', '5', 
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private int i = 0;  
    public ServerThread(Socket client,int i){  
        this.client = client;  
        this.i = i;
    }  
       
    //处理通信细节的静态方法，这里主要是方便线程池服务器的调用  
    public static void execute(Socket client,int i){  
        try{  
            //获取Socket的输出流，用来向客户端发送数据    
            PrintStream out = new PrintStream(client.getOutputStream());  
            //获取Socket的输入流，用来接收从客户端发送过来的数据 
            
            
            InputStream  bs = client.getInputStream();
            boolean flag =true;  
//            client.setSoTimeout(3000);
            client.setReceiveBufferSize(1024*1024*10);
//            client.setReceiveBufferSize(1024*1024*10);
            Jedis jedis = new Jedis("127.0.0.1",6379);
            byte[] data = new byte[20];
            int index = 0;
            String str = "";
            char[] buf = null;
            
            dp.InitData(jedis);
            
            BufferedWriter txt = new BufferedWriter(new FileWriter(new File("E:\\test\\tcp.txt")));
            
            while(flag){  
            	if(bs.available() > 0){
            		 data = new byte[bs.available()];
            		 bs.read(data);
            		 buf = new char[data.length*2];
            		 index = 0;
            		 for(byte b : data) { // 利用位运算进行转换，可以看作方法一的变种
            			 buf[index++] = HEX_CHAR[b >>> 4 & 0xf];
            			 buf[index++] = HEX_CHAR[b & 0xf];
                     }
            		 str += new String(buf);
            		 str = dp.DataStr(str.trim(),jedis,txt);
            		 
            		 if(jedis.get("flag").toString().equals("0")){
            			 break;
            		 }
            	}else{
            		Thread.sleep(500);
            	}
            	
            }  
            txt.close();
            out.close();  
            bs.close();  
            client.close();  
        }catch(Exception e){  
            e.printStackTrace();  
        }  
    }  
    @Override  
    public void run() {  
        execute(client,i);  
    }  
  
    public void test(){
    	
    }
}  