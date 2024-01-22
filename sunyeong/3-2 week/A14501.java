package baekjoon_CodingStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A14501 {

	//퇴사
	//dp는 이전의 값들을 활용한다는걸 잊지말자!!!
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		// 일하는 기간 N
		int N=Integer.parseInt(br.readLine());

		int [] t=new int[N+1];
		int [] p=new int[N+1];
		int [] dp=new int[N+2]; //퇴사 다음일도 고려하기 위해 배열 하나 크게 생성(최대 이익을 고려하기 위한 배열)
		
		for(int i=1;i<=N;i++) {
			
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			t[i]=Integer.parseInt(st.nextToken());
			p[i]=Integer.parseInt(st.nextToken());
			
		}
		//최대한 많은 상담을 한다고했음!
		//1일부터 시작한다는게 아님 t의 일수를 계산하여 최대한 많이 상담을 하게가 포인트
		for(int i=N;i>=1;i--) {
			int end_counsel=i+t[i]-1; //현재 i 일 + t[i] (상담일)-1=상담 종료일
			
			//p[i]+dp[end_counsel+1] => 선택된값 최대이익 + 다음 인덱스
			dp[i]=Math.max(dp[i+1], end_counsel<N+1?p[i]+dp[end_counsel+1]:0);
			
		}
		System.out.println(dp[1]); //최종 최대 이익은 내림차순으로 1에 저장된다.
		
	}

}
