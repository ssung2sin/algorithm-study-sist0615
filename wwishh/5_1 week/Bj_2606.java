package baekjoon;

import java.util.Scanner;

public class Bj_2606 {

	static boolean[] computer;
	
	static void dfs(int node, int[][] network) {
		computer[node] = true;

		for (int i = 0; i < network.length; i++) {
			if (network[i][0] == node && !computer[network[i][1]]) {
				dfs(network[i][1], network);
			}
			else if (network[i][1] == node && !computer[network[i][0]]) {
                dfs(network[i][0], network);
            }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt(); //컴퓨터 수
		int pair = sc.nextInt(); //컴퓨터 쌍의 수

		computer = new boolean[cnt + 1];

		int trueCount = 0;

		int[][] network = new int[pair][2];

		for (int i = 0; i < network.length; i++) {
			for (int j = 0; j < network[0].length; j++) {
				network[i][j] = sc.nextInt();
			}
		}

		//      처음 작성한 코드
		//		for(int i=0; i<network.length; i++) {
		//			if(network[i][0]==1) {
		//				computer[network[i][1]] = true;
		//				for(int j=0; j<network.length; j++) {
		//					if(network[j][0]==network[i][1]) {
		//						computer[network[j][1]] = true;
		//					}
		//				}
		//			}
		//		}

		dfs(1, network);

		for (boolean t : computer) {
			if (t)
				trueCount++;
		}

		System.out.println(trueCount - 1);
	}

}
