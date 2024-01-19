package algorithm_3Week_2;

import java.util.Scanner;

public class BJ14501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();				// 일하는 날짜
		
		int time[] = new int[n + 1];			// T의 역할, 상담일
		int pay[] = new int[n + 1];			// P의역할, 금액
		
		for(int i = 1; i <= n; i++) {
			time[i] = sc.nextInt();
			pay[i] = sc.nextInt();
		}
		
		int dp[] = new int[n+1];
		
		// 점화식 부분 검색
		for(int i = 1; i <= n; i++) {
			if(i + time[i] -1 <= n) {
				 dp[i + time[i] - 1] = Math.max(dp[i + time[i] - 1], dp[i - 1] + pay[i]);
            }
            dp[i] = Math.max(dp[i], dp[i - 1]);
		}
		
		System.out.println(dp[n]);
	}

}
 