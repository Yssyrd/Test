package com.nrs.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import redis.clients.jedis.Jedis;

/**
 * @author 杨润东
 *
 * @date: 2018年6月26日 下午3:07:39
 */
public class Server {

	public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket server = new ServerSocket(8123);  
        Socket client = null;  
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.set("flag","1");
        //通过调用Executors类的静态方法，创建一个ExecutorService实例  
        //ExecutorService接口是Executor接口的子接口  
        Executor service = Executors.newCachedThreadPool();  
        boolean f = true;  
        int i = 0;
        server.setSoTimeout(3000);
        while(f){  
        	
        	 if(jedis.get("flag").toString().equals("1")){
        		 System.out.println("服务端已启动监听！");
        		 //等待客户端的连接  
        		 if(server.isClosed()){
        			 server = new ServerSocket(8123); 
        			 server.setSoTimeout(3000);
        		 }
        		 
            	 try {
            		 client = server.accept();
                     i++;
                     System.out.println("与客户端连接成功！");  
                     //调用execute()方法时，如果必要，会创建一个新的线程来处理任务，但它首先会尝试使用已有的线程，  
                     //如果一个线程空闲60秒以上，则将其移除线程池；  
                     //另外，任务是在Executor的内部排队，而不是在网络中排队  
                     service.execute(new ServerThread(client,i));  
    			} catch (Exception e) {
    				continue;
    			}
        	 }else{
        		 
        		 server.close();
        		 
        		 System.out.println("服务端已关闭监听，等待启动命令");
        	 }
        	 Thread.sleep(1000);
        }   
        System.out.println("服务端关闭");
        if(!server.isClosed()){
        	 server.close();  
		 }

    }
}
