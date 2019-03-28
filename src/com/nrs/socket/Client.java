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
 * @author ����
 *
 * @date: 2018��6��26�� ����3:08:48
 */
public class Client {

	public static void main(String[] args) {

        try {
            // 1.���� socket ָ����������ַ�Ͷ�
            Socket client = new Socket("192.168.10.101", 20006);
            // 2.�ͻ�������������͵�¼��Ϣ
            OutputStream os = client.getOutputStream();// �ֽ������
            PrintWriter pw = new PrintWriter(os);
            pw.write("�û���: admin;���룺123");
            pw.flush();
            client.shutdownOutput();// �ر������

            // 3. ��ȡ������
            InputStream is = client.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String info = null;
//            while ((info = br.readLine()) != null) {
//                System.out.println("������������Ϣ˵��" + info);
//            }

            // 3.�ر�������Դ
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
