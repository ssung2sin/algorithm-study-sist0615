package bj_2024;

import java.util.Scanner;

//1, 2, 3 더하기
public class bj_9095 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int i;
		int[] dp = new int[12];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		int n;
		int j;
		String ans = "";
		
		for(i=0; i<t; i++) {
			n = scanner.nextInt();
			for(j=4; j<=n; j++) {
				dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
			}
			ans += dp[n] + "\n";
		}
		System.out.println(ans);
	}

}

