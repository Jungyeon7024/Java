package com.kh.GraphMain;

public class GraphMain {

	public static void main(String[] args) {
		int ver = 5;
		Graph graph = new Graph(ver);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		
		System.out.println("DFS 탐색 결과 :");
		graph.DFS(0);
	}

}

/*
 * DFS 탐색을 시작하여 그 결과를 출력
 * 탐색 결과는 시작 노드에서 출발하여 깊이 우선으로 탐색 후 노드를 방문한 순서대로 출력
 * */

