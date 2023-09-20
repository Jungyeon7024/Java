package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;


/*
 main 메서드
 	그래프의 BFS 탐색을 구현하고, 주어진 시작 노드로부터 모든 연결된 노드를 너비 우선으로 탐색
 * */


	public class BFSMain{
	
	
	
	
	public static void main(String[] args) {
		
		Graph g = new Graph(6);
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);
		
		System.out.print("0 : ");
		g.BFS(0);
		System.out.println();
		System.out.print("1 : ");
		g.BFS(1);
		System.out.println();
		System.out.print("2 : ");
		g.BFS(2);
		System.out.println();
		System.out.print("3 : ");
		g.BFS(3);
		System.out.println();
		System.out.print("4 : ");
		g.BFS(4);
		System.out.println();
		System.out.print("5 : ");
		g.BFS(5);
	}

}