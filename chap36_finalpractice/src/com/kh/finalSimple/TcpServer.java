package com.kh.finalSimple;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[]args) throws Exception {
	int port =4442;
	
	ServerSocket server;
	
	server = new ServerSocket(port);
	System.out.println(port);
	while(true) {
		Socket client = server.accept();
		System.out.println(" 클라이언트와 연결되었습니다! ");
	
		
		client.close();
	}
}
	
	
}