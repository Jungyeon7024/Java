package com.kh.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
네트워크 통신을 위한 중요한 클래스
UDP(User datagram Protocol) 사용해서 데이터를 송수신 하는데 사용
DatagramSocket
	UDP 통신을 위한 소켓 클래스
	TCP 소켓과 다르게 연결을 설정하거나 연결 유지를 관리하지 않고
		데이터 패킷을 그냥 보내고 받는 역할
DatagramPacket
	UDP 데이터 패킷을 나타내는 클래스
	데이터의 실제 내용과 데이터를 보낼 대상 
	또는 데이터를 수신할 대상의 주소 정보 포함
	Packet이란? 컴퓨터 네트워크가 전달하는 데이터의 형식화된 블록
				데이터를 주고받을 때 정해놓은 규칙
				Pack + bucket 합성어
*/
public class UDPServer {
	//start UDP 서버를 시작하는 메서드 예외를 던질 수 있으므로 예외처리가 필요
	public void start() throws Exception {
		DatagramSocket socket = new DatagramSocket(7024);
		DatagramPacket inPacket, outPacket;
		// 7024번 포트를 사용하는 생성 소켓을 통해 UDP통신이 이루어짐
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		
		while(true) {
			//데이터를 수신하기 위한 패킷을 생성
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			//패킷을 통해 데이터를 받음
			socket.receive(inPacket);
			
			//수신한 패킷에서 클라이언트의 IP & Port
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			
			//서버의 현재 시간을 시분초 형태로 반환
			SimpleDateFormat simpleDate =new SimpleDateFormat("[hh:mm:ss]");
			String time = simpleDate.format(new Date());
			outMsg = time.getBytes(); //byte 배열로 변환
			
			//패킷을 생성해서 클라이언트한테 전송
			outPacket = new DatagramPacket(outMsg,outMsg.length,address,port);
			}
		}
	public static void main(String[] args) {
		try {
			new UDPServer().start(); //Udp 서버 실행
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}