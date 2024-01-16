package baekjoon_CodingStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A9655 {

	static String [] result;
	//9655 돌게임 - 마지막 돌을 가져가는 사람이 게임을 이김, 돌은 1 or 3 으로 가져갈 수 있음
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(bf.readLine()); //돌 갯수 입력
		result=new String[N+1]; // 0 1 2 3 4 5 
		
		String final_winner=winner(N);
		
		System.out.println(final_winner);
		
		
	}
	
	 static String winner(int N) {
		result[0]="CY"; //돌이 0개이면 창영 승 -> 상근이 가져갈 돌 없으므로
		result[1]="SK"; //돌이 1개이면 상근 승
		
		for(int i=2; i<=N; i++) {
			//이전값들로 비교
			if(result[i-1].equals("SK")||result[i-3].equals("SK")) {
				result[i]="CY"; 
			}else {
				result[i]="SK";
			}
		}
		
		return result[N];
	}
}
