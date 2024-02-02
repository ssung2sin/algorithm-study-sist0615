package bj_2024;

import java.util.Scanner;

public class bj_2606 {
	
	static int num;				//컴퓨터 수
	static int line;			//컴퓨터 쌍 수
	static int[][] graph;
	static boolean[] visited;	//방문 했는지 여부
	static int result;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		num = in.nextInt();
		line = in.nextInt();
		graph = new int[num+1][num+1];
		visited = new boolean[num+1];
		
		for(int i=1;i<=line;i++) {
			int n = in.nextInt();
			int m = in.nextInt();
			
			graph[n][m] = 1;
			graph[m][n] = 1;
		}
		
		dfs(1);		//1번부터 탐색 시작
		System.out.println(result-1);		//1번 컴퓨터는 빼야하므로
	}

	private static void dfs(int idx) {
		result++;
		visited[idx] = true;
		
		for(int i=1;i<=num;i++) {
			if(!visited[i] && graph[idx][i] == 1) {			//해당 인덱스를 방문한적이 없고 (idx,i)가 1일때
				dfs(i);
			}
		}
	}

}
