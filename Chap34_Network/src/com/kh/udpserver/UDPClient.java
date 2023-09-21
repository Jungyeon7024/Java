package com.kh.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {
	public void start() throws Exception {
		DatagramSocket dataSocket = new DatagramSocket();
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
		//InetAddress serverAddress = InetAddress.getAllByName("127.0.0.1");
												// All 이 들어갔는지 확인
		// 데이터가 저장될 공간을 임의의 지정된 크기로 byte 배열 생성
		byte[] msg = new byte[200];
		DatagramPacket outPacket = new DatagramPacket(msg,1,serverAddress,8888);
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		// DatagramPacket을 전송
		dataSocket.send(outPacket);
		// DatagramPacket을 수신
		dataSocket.receive(inPacket);
		System.out.println("서버의 현재 시간 : " + new String(inPacket.getData()));
		
		dataSocket.close();
	}
	public static void main(String[] args) {
		try {
			new UDPClient().start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}