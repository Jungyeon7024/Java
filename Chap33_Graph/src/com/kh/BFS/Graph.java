package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;
/*
 Graph
 * */
public class Graph {
	private int V; //그래프의 정점 수
	private LinkedList<Integer>[] adj; //인접 리스트
	
	//그래프 초기화
	//Graph 클래스의 생성자에서 그래프 정점 수(V)를 받아서 초기화
	//adj 인접 리스트를 나타내고, 각 정점마다 인접한 정점들의 목록을 저장
	public Graph(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i) {
			adj[i] = new LinkedList();
		}
	}
	
	//그래프 간선 추가
	//addEdge 그래프에 간선을 추가
	//v와w 가 간선의 양 끝에 정점을 나타냄
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	//BFS 탐색을 수행
	public void BFS(int start) {
		//visited 배열은 각 정점의 방문 여부를 추적
		boolean[] vistied = new boolean[V]; //방문 여부를 표시하기 위한 배열
		//BFS를 위한 데이터 구조로 사용
		Queue<Integer> queue = new LinkedList<>();
		//탐색은 시작 노드(start)에서 시작하고
		//시작 노드를 방문하고 큐에 추가
		vistied[start] = true;
		queue.add(start);
		
		while(!queue.isEmpty()) {
			start = queue.poll();
			System.out.print(start + " ");
			
			for(Integer neighbor : adj[start]) {
				if(!vistied[neighbor]) {
					vistied[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
	}
}