package bj_2024;

import java.util.Scanner;

public class bj_15649 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int depth = 0;
		int[] arr = new int[m];
		boolean[] visit = new boolean[n];
		
		dfs(n,m,depth,arr,visit);

	}

	private static void dfs(int n, int m, int depth, int[] arr, boolean[] visit) {

		if(depth == m) {
			for(int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(n,m,depth+1,arr,visit);
				
				visit[i] = false;
			}
		}
		
	}

	

}
