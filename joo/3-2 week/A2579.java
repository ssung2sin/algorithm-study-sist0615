package baekjoon.week3_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A2579 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        // 계단 오르기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int stair = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //int max = 0;

        for (int i = 0; i < stair; i++) {
            int score = Integer.parseInt(br.readLine());
            arr.add(score);
        }        
        
        // 동적 계획법을 위한 배열을 초기화
        int[] dp = new int[stair + 1];
        
        // 첫 번째 계단의 점수를 배열에 저장
        dp[1] = arr.get(0);

        // 두 번째 계단까지의 최대 점수를 계산
        if (stair > 1) {
            dp[2] = arr.get(0) + arr.get(1);
        }

        // 세 번째 계단부터 동적 계획법을 활용하여 최대 점수를 계산
        for (int i = 3; i <= stair; i++) {
            dp[i] = Math.max(dp[i - 2] + arr.get(i - 1), dp[i - 3] + arr.get(i - 2) + arr.get(i - 1));
        }

        // 계산된 최대 점수를 출력합니다.
        System.out.println(dp[stair]);
       
    }
}
