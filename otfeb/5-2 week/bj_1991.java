package bj_2024;

import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_1991 {
	
	static String[] tree;
	static boolean[] visited;
	static Scanner in = new Scanner(System.in);
	static StringTokenizer st;
	
	public static void main(String[] args) {
		
		String root = "";
		String left = "";
		String right = "";

		int n = in.nextInt();
		in.nextLine();
		int idx = 0;
		
		if(n < 3) {
			//??
		}
		else {
			makeNode(n,idx,root,left,right);
		}
		
		for(int i=0;i<tree.length;i++) {				//트리 생성 확인
			System.out.print(tree[i]+" ");
		}

	}

	private static void makeNode(int n, int idx, String root, String left, String right) {

		String node = in.nextLine();
		
		st = new StringTokenizer(node);
		tree = new String[n];
		
		root = st.nextToken();
		left = st.nextToken();
		right = st.nextToken();
		
		String preRoot = root;
		String preLeft = left;
		String preRight = right;

		if(n == 0) {
			return;
		}
		if(idx == 0) {
			tree[idx] = root;
			idx++;
			tree[idx] = left;
			idx++;
			tree[idx] = right;
		}
		else {
			if(left.equals(".") && right.equals(".")) {		//자식이 없을 경우
				makeNode(n-1,idx+1,root,left,right);
			}
			else {
				if(preRoot.equals(root)) {					//루트가 같을 경우 왼쪽 노드부터 값 넣기
					tree[idx] = preLeft;					//pre가 왼쪽 노드
					idx++;
					tree[idx] = preRight;
					idx++;
					tree[idx] = left;						//오른쪽 노드
					idx++;
					tree[idx] = right;
					
					makeNode(n-1, idx+1, root,left,right);
				}
				else {
					tree[idx] = left;
					idx++;
					tree[idx] = right;
					
					makeNode(n-1, idx+1, root,left,right);
				}
			}
		}
		
		
	}

}
