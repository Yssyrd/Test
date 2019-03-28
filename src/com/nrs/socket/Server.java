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
 * @author ����
 *
 * @date: 2018��6��26�� ����3:07:39
 */
public class Server {

	public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket server = new ServerSocket(8123);  
        Socket client = null;  
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.set("flag","1");
        //ͨ������Executors��ľ�̬����������һ��ExecutorServiceʵ��  
        //ExecutorService�ӿ���Executor�ӿڵ��ӽӿ�  
        Executor service = Executors.newCachedThreadPool();  
        boolean f = true;  
        int i = 0;
        server.setSoTimeout(3000);
        while(f){  
        	
        	 if(jedis.get("flag").toString().equals("1")){
        		 System.out.println("�����������������");
        		 //�ȴ��ͻ��˵�����  
        		 if(server.isClosed()){
        			 server = new ServerSocket(8123); 
        			 server.setSoTimeout(3000);
        		 }
        		 
            	 try {
            		 client = server.accept();
                     i++;
                     System.out.println("��ͻ������ӳɹ���");  
                     //����execute()����ʱ�������Ҫ���ᴴ��һ���µ��߳����������񣬵������Ȼ᳢��ʹ�����е��̣߳�  
                     //���һ���߳̿���60�����ϣ������Ƴ��̳߳أ�  
                     //���⣬��������Executor���ڲ��Ŷӣ����������������Ŷ�  
                     service.execute(new ServerThread(client,i));  
    			} catch (Exception e) {
    				continue;
    			}
        	 }else{
        		 
        		 server.close();
        		 
        		 System.out.println("������ѹرռ������ȴ���������");
        	 }
        	 Thread.sleep(1000);
        }   
        System.out.println("����˹ر�");
        if(!server.isClosed()){
        	 server.close();  
		 }

    }
}
