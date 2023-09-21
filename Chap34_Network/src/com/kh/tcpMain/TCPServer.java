package com.kh.tcpMain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8080);
			System.out.println("서버 대기 중!");
			
			//만약에 클라이언트와 연결하고 싶다면 클라이언트와 연결하는 코드 작성
			while(true) {
				// 클라이언트와 연결 대기
				Socket client = serverSocket.accept();
				System.out.println(" 클라이언트와 연결되었습니다! ");
				
				
				//읽어 올때 코드
				InputStream inStream = client.getInputStream();
				Scanner sc = new Scanner(inStream);
				System.out.println("Server | Client : " + sc.nextLine());
				
				
				OutputStream outStream = client.getOutputStream();
				PrintStream printStream = new PrintStream(outStream);
				System.out.println("Server | Client ");
				printStream.flush();//버퍼의 데이터를 한 번에 쏟아냅니다.
				
				
				client.close();// 클라이언트와 연결 종료
				System.out.println("Server "+ client.getInetAddress().getHostAddress());
				
				
				//만약 서버는 무한대로 실행이 되어야 하나 실행에 제한을 주고 싶을때
				int count =0;
				if(count>7) {
					serverSocket.close(); // 서버 종료
					System.out.println("Server Close");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
