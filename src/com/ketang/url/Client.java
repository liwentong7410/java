/**
 * 
 */
package com.ketang.url;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
/**
 * 
 * @Title:Client.java
 * @Package:com.ketang.url
 * @Description:TODO
 *
 *
 * @author liwentong
 * @date 2017��11��27������4:26:52
 * @version 1.0
 */
public class Client {

	public static InputStream is = null;
	public static OutputStream os = null;
	public static Scanner sc=null;
	public static Socket s=null;
	
	public static void main(String[] args) {
		
		try {
			Client.s=new Socket("192.168.3.40", 998);
			System.out.println("�ͻ��˰󶨷���˳ɹ�");
			Client.is=s.getInputStream();
			Client.os=s.getOutputStream();
		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
			
			
			while (true) {
				// --�ͻ���ͨ�������������д��Ϣ.
				byte[] buffer = null;
				System.out.println(new String(buffer));
				if (new String(buffer).substring(0,6).equals("exit..")) {
					break;
				}
			}
				
		
		
			String str = null;
			while(true){
				sc = new Scanner(System.in);
				System.out.print("������:");
				str = sc.next();
				try {
					os.write(str.getBytes());
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				if (str.substring(0,6).equals("exit..")) {
					break;
				}
			}
	}
}

// exit..