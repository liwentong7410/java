/**
 * 
 */
package com.practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Title:ServerSorket.java
 * @Package:com.practice
 * @Description:TODO
 *
 *
 * @author liwentong
 * @date 2017��11��27������7:15:36
 * @version 1.0
 */
public class ServerSorket {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(60001);
			System.out.println("�ȴ��ͻ������ӡ�����");
			//�������������������յ����׽��ֵ����ӣ�
			Socket s = ss.accept();
			System.out.println("�ͻ���������");
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			byte[] b=new byte[1024];
			is.read(b);
			System.out.println("���յ����Կͻ��˵���Ϣ��"+new String(b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
