package com.kh.tcpMain;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) throws Exception{
		// 서버 주소와 포트번호로 소켓 생성
		// 서버 주소와 포트번호는 내가 연결하고자 하는 포트와 동일해야함
	
			Socket socket = new Socket("localhost",8080);
			System.out.println("[Server Connet]");
			
			//보낼 떄 코드
			OutputStream outStream = socket.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);
			printStream.print("AHhhhhhhhhhhhhhhhhh ");
			printStream.flush();
			
		
			InputStream inStream = socket.getInputStream();
			Scanner sc = new Scanner(inStream);
			
			socket.close();
			System.out.println("Bye Server See you ㅇ0ㅇ");
			
				
	}
	}

