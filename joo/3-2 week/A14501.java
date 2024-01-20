package baekjoon.week3_2;

import java.util.Scanner;

public class A14501{
    public static void main(String[] args) {
        
    	//scanner
    	Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  // N 입력
        int[][] consultations = new int[N][2];  // 상담 정보를 저장할 배열([기간,금액],[기간,금액])

        // 상담 정보 입력
        for (int i = 0; i < N; i++) {
            consultations[i][0] = scanner.nextInt();  // Ti
            consultations[i][1] = scanner.nextInt();  // Pi
        }

        // DP 테이블 초기화
        int[] dp = new int[N + 1];

        // 역순으로 DP 테이블 갱신
        for (int i = N - 1; i >= 0; i--) {
            int nextDay = i + consultations[i][0];

            // 상담이 퇴사 전에 끝나는 경우
            if (nextDay <= N) {
                dp[i] = Math.max(consultations[i][1] + dp[nextDay], dp[i + 1]);
            }
            // 상담이 퇴사일 이후에 끝나는 경우
            else {
                dp[i] = dp[i + 1];
            }
        }

        // 최종 결과 출력
        System.out.println(dp[0]);
    }
}

