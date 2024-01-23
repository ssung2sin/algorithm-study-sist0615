package baekjoon.week3_1;

import java.util.Scanner;

public class A9655 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//돌게임
		//돌은 1개 또는 3개 가져갈 수 있다.
		//마지막 돌을 가져가는 사람이 게임을 이기게 된다.
		
		Scanner sc = new Scanner(System.in);
		int rock = sc.nextInt();
		String sang = "SK";
		String chang = "CY";
		
		//플레이어 초기화
		String currentPlayer = sang;
		
		//플레이어에 따른 결과
		if(rock%2 == 1) { //돌멩이 개수가 홀수이면...현재플레이어가 1개 or 3개의 돌을 가져가더라도 전체에서 남은 돌멩이는 짝수가 됨.그러니 마지막에 남은 돌을 가져가는 사람은? 바로 현재 플레이어
			System.out.println(currentPlayer);	
		}else { //돌멩이 개수가 짝수이면
			System.out.println(currentPlayer.equals(sang)?chang:sang);
		}
		
	}

}
