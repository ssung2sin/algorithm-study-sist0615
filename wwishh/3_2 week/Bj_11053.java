package baekjoon;

import java.util.Scanner;

public class Bj_11053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] arr = new int[size]; //수열
		int[] dp = new int[size];
		int cnt = 1;

		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < size; i++) {
			dp[i] = 1;

			//질문게시판 참고
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
					cnt = Math.max(cnt, dp[i]);
				}

			}

		}

		System.out.println(cnt);

	}

}
