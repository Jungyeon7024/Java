package com.kh.treeMain;

/*
 * 노드를 나타내는 데 적절한 클래스
 */

public class TreeNode {
	int data;       // 데이터 저장
	TreeNode left;  // 왼쪽 자식 노드를 참고하는 링크
	TreeNode right; //오른쪽 자식 노드를 참고하는 링크
	
	
	//노드를 생성할 때 데이터를 초기화하고 왼쪽과 오른쪽 링크를 null로 초기화
	public TreeNode(int data) {
		this.data = data;
		this.left =  null;
		this.right = null;
	}
	
}
