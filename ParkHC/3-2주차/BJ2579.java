package algorithm_3Week_2;

import java.util.Scanner;

public class BJ2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();								// 계단의 갯수
		int score[] = new int[n + 1];						// 점수를 담을 배열
		int stair[] = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			stair[i] = sc.nextInt();
		}
		
//		int finalStair = stair.length - 1;		
//		System.out.println(finalStair);
//		int highScore = Math.max() + finalStair;
	
//		계단을 세번 연속으로 못밟으므로
//		마지막 계단을 밟을 수 있는 방법 : (마지막-3, 마지막-1, 마지막) / (마지막 -2, 마지막)
		
		if (n >= 1) {
			score[1] = stair[1];
		}
		if (n >= 2) {
			score[2] = stair[1] + stair[2];			
		}

//		검색부분		
		for(int i = 3; i <= n; i++){
			score[i] =  Math.max(score[i - 2], score[i - 3] + stair[i-1]) + stair[i];
		}
		
		System.out.println(score[n]);
		

	}
}
