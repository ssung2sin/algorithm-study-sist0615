package algorithm_3Week._1;

import java.util.Scanner;

public class BJ9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();					// 테스트 케이스의 개수
		int dp[] = new int[11];					// 임의의 정수... 정수형의 수를 넣어야해서 예시 10보다 큰 정수인 11사용

		dp[0] = 0;
		dp[1] = 1;								// 1
		dp[2] = 2;						 		// 1+1, 2
		dp[3] = 4;								// 1+1+1, 1+2, 2+1, 3
												// 그냥 32비트 최고 수를 출력하는 Integer.MAX_VALUE를 바로 사용하고 싶었으나 메모리 이슈...

		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();				// 정수 n

			for(int j = 4; j <= n; j++) {
				
				dp[j] = dp[j-1] + dp[j-2] + dp[j-3]; 
			}

			System.out.println(dp[n]);
		}
	}

}
