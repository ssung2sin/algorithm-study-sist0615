package baekjoon;

import java.util.Scanner;

public class Bj_14501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int[] t = new int[day]; //걸리는 시간
		int[] p = new int[day]; //수익
		
		int[] dp = new int[day+1];
		
		for(int i=0; i<day; i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		
		for(int i=0; i<day; i++) {
			if(i+t[i]<=day) 
				dp[i+t[i]] = Math.max(dp[i+t[i]], dp[i]+p[i]); //점화식
			dp[i+1]=Math.max(dp[i+1], dp[i]); //누적된 max값 
		}
		System.out.println(dp[day]);
		
	}

}
