package baekjoon_CodingStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A2579 {

	//계단 오르기 - 동적 프로그래밍
	// 어려웠음 추후 다시 한 번 풀어보기
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int stair_count=Integer.parseInt(br.readLine()); //계단의 갯수
		int [] stair_score=new int[stair_count+1]; // 계단의 점수 저장을 위한 배열
		for(int i=1;i<=stair_count;i++) {
			stair_score[i]=Integer.parseInt(br.readLine());
		}
		
		int [] dp=new int[stair_count+1]; // stair_score에 저장된 값들을 비교해 더 큰 값들을 비교 출력하기 위한 배열
		
		dp[1]=stair_score[1];
		
		if(stair_count>1) {
			dp[2]=stair_score[1]+stair_score[2];
		}
		
		for(int i=3; i<=stair_count;i++) {
			
			//dp는 주어진 조건에 맞게 값을 비교하여 최댓값을 저장하는 배열이다.
			dp[i]=Math.max(dp[i-2], dp[i-3]+stair_score[i-1])+stair_score[i];
		}
		
		System.out.println(dp[stair_count]);
	}
	
}