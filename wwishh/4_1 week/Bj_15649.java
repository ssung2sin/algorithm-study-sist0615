package baekjoon;

import java.util.Scanner;

public class Bj_15649 {

	static int n;
	static int m;
	static int[] arr;
	static boolean[] check;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		check = new boolean[n + 1];
		arr = new int[m + 1]; //생성된 순열을 저장하기 위한 배열

		dfs(0);
	}

	public static void dfs(int depth) {
		if (depth == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(!check[i]) {
				check[i] = true;
				arr[depth] = i+1;
				dfs(depth+1);
				check[i] = false;
			}
		}
	}

}
