package Baekjoon;
import java.util.Scanner;

public class A2579 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stairs = sc.nextInt();

		int[] stair = new int[stairs+1]; //현재 계단 j의 점수 첫번째계단부터 시작하므로 +1
		int[] score = new int[stairs+1]; //현재 계단 j까지 도달했을 때점수

		for (int i = 1; i <= stairs; i++) {//첫번째계단 부터 총 계단수까지
			stair[i] = sc.nextInt();
		} 
		score[0] = stair[0] =0;
		score[1] = stair[1]; //첫번째계단까지 도달했을때
		//stairs==2,3이 안되는이유 ) 계단이 정확히 해당갯수일때만 식이 돌아감
		if (stairs >= 2)
			score[2] = stair[1] + stair[2]; // 두번째계단까지 도달했을때
		if (stairs >= 3)
			score[3] = Math.max(stair[1], stair[2]) + stair[3]; // 세번째계단까지 도달했을때

		//3까지 초기화 되있으므로 if문으로 안감싸도된다
		for (int j = 4; j <= stairs; j++) {  //네번째계단 부터 총 계단수까지
			//j=4라고 가정
			//score[4] = Math.max(score[1] + stair[3], score[2]) + stair[4];  //stair[4] 는 마지막계단이 됨.

			//score[5] = Math.max(score[2] + stair[4], score[3]) + stair[5];  //stair[5] 는 마지막계단이 됨.
			//다섯번째계단에 도달했을때 점수의합계는 (두번째계단까지 올라갔을때 점수의합계+네번째계단의 점수를 더한값)과 세번째계단까지 올라갔을때 점수의합계를 비교하고 마지막계단의점수를 더한다
			//두번째계단까지 올라가는경우는  score[2] = stair[1] + stair[2]; //두번째계단까지 도달했을때
			//세번째 계단까지 올라가는 경우는 첫번째,세번째 or 두번째,세번째

			//j번째 계단까지 도달했을때의 점수는~
			score[j] = Math.max(score[j - 3] + stair[j - 1], score[j - 2]) + stair[j];
		}

		System.out.println(score[stairs]);
	}
}