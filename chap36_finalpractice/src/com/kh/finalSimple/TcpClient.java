package com.kh.finalSimple;

import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
	public static void main(String[] args) throws Exception{
	int port =7024;
	String serverIP;
	
	try {
		serverIP = InetAddress.getLocalHost().getHostAddress();
		Socket socket = new Socket(serverIP, port);
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
	
	
	
}