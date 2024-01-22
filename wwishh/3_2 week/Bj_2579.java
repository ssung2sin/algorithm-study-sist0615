package baekjoon;

import java.util.Scanner;

public class Bj_2579 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] score = new int[count];
		
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		if(count==1)
			System.out.println(score[0]);
		else if(count==2)
			System.out.println(score[0]+score[1]);
		else if(count>=3) {
			int[] dpScore = new int[count];
			
			dpScore[0] = score[0];
			dpScore[1] = score[0] + score[1];
			dpScore[2] = Math.max(score[0], score[1]) + score[2];
			
			//점화식 -> 최종 도착 계단은 무조건 포함 되어야 하고 연속으로 3개는 못 지나가기 때문에
			//n-3 n-1 n 으로 도착하던가 n-2 n으로 도착
			for(int i=3; i<dpScore.length; i++)
				dpScore[i] = Math.max(dpScore[i-3] + score[i-1], dpScore[i-2]) + score[i];
			
			System.out.println(dpScore[count-1]);
		}
		

	}

}
