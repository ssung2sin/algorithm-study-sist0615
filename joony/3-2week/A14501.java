package Week3_2;

import java.util.Scanner;

//퇴사, 다이나믹 프로그래밍
public class A14501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  // 퇴사까지의 날짜 수
        int[] dp = new int[N + 1];  // DP 테이블 초기화

        int[] T = new int[N];  // 상담 소요 기간 배열
        int[] P = new int[N];  // 상담 이익 배열

        // 상담 스케줄 입력 받기
        for (int i = 0; i < N; i++) {
            T[i] = scanner.nextInt();
            P[i] = scanner.nextInt();
        }

        // 퇴사 날부터 1일까지 거꾸로 최대 이익을 구함
        for (int i = N - 1; i >= 0; i--) {
            if (i + T[i] > N) {
                dp[i] = dp[i + 1];
            } else {
                dp[i] = Math.max(dp[i + 1], P[i] + dp[i + T[i]]);
            }
        }

        System.out.println(dp[0]);  // 0일째부터 시작하여 최대 이익 출력
    }

	

}
