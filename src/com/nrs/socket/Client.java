package com.nrs.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 杨润东
 *
 * @date: 2018年6月26日 下午3:08:48
 */
public class Client {

	public static void main(String[] args) {

        try {
            // 1.创建 socket 指定服务器地址和端
            Socket client = new Socket("192.168.10.101", 20006);
            // 2.客户端向服务器发送登录信息
            OutputStream os = client.getOutputStream();// 字节输出流
            PrintWriter pw = new PrintWriter(os);
            pw.write("用户名: admin;密码：123");
            pw.flush();
            client.shutdownOutput();// 关闭输出流

            // 3. 获取输入流
            InputStream is = client.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String info = null;
//            while ((info = br.readLine()) != null) {
//                System.out.println("服务器发来消息说：" + info);
//            }

            // 3.关闭其他资源
            pw.close();
            os.close();
            client.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
	
	
}
