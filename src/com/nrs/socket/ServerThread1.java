package com.nrs.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread1 implements Runnable{

    Socket socket = null;//�ͱ��߳���ص�Socket
        
    public ServerThread1(Socket socket) {
	    this.socket = socket;
	}

    @Override
    public void run() {
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        OutputStream os = null;
        PrintWriter pw = null;
        try {
            //��ͻ��˽���ͨ�ţ���ȡ����������ȡȡ�ͻ����ṩ����Ϣ
            is = socket.getInputStream();
            isr = new InputStreamReader(is,"GBK");
            br = new BufferedReader(isr);
            String data = null;
            while((data=br.readLine()) != null){//ѭ����ȡ�ͻ��˵���Ϣ
                System.out.println("���Ƿ��������ͻ����ύ��ϢΪ��"+data);
            }
            socket.shutdownInput();//�ر�������
            
            //��ȡ���������Ӧ�ͻ��˵�����
            os = socket.getOutputStream();
            pw = new PrintWriter(os);
            pw.write("����������Ӧ�ɹ���");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //�ر���Դ�����socket
            try {
                if(pw!=null)
                    pw.close();
                if(os!=null)
                    os.close();
                if(br!=null)
                    br.close();
                if(isr!=null)
                    isr.close();
                if(is!=null)
                    is.close();
                if(socket!=null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
        
    }

}