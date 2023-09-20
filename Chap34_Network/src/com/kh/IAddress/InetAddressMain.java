package com.kh.IAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {

	public static void main(String[] args) {
		try {
			//호스트 이용해서 객체 생성 
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			//IP 주소 출력 
			System.out.println("Hos Name : " + address.getHostName());
			System.out.println("IP Address : " +address.getHostAddress());
			
			InetAddress address2 = InetAddress.getByName("lostark.game.onstove.com");
			System.out.println("Hos Name : " + address2.getHostName());
			System.out.println("IP Address : " +address2.getHostAddress());
			
			//현재 호스트의 InetAddress 객체 얻기
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : " + localHost.getHostName());
			System.out.println("Local IP Address : " + localHost.getHostAddress());
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
