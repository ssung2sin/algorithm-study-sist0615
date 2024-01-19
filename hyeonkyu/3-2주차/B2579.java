package Algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2579 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] scoreArr = new int[N+1];
		int[] dp = new int[301];

		//입력
		for (int i = 1; i <N+1 ; i++) {
			scoreArr[i] = Integer.parseInt(br.readLine());
		}

		//계단 개수를 1개 또는 2개로 설정할 경우 처리
		if(N>=2) {
			dp[2] = scoreArr[1]+scoreArr[2];
		}

		for (int i = 3; i <=N ; i++) {
			dp[i] = Math.max(dp[i-2] + scoreArr[i], dp[i-3] + scoreArr[i-1] + scoreArr[i]);


		}

		System.out.println(dp[N]);

	}

}
