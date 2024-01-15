package Week3;

import java.util.Scanner;

//다이나믹 프로그래밍, 돌 게임
public class A9655 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int stoneNum = sc.nextInt();//입력받은 돌의 개수
		
		
		//상근이부터 게임을 시작함
		//한 게임에서 이루어질 수 있는 경우의 수
		//1	1=>2
		//1	3=>4
		//3	1=>4
		//3	3=>6
		//즉, 순서가 두 번째인 창영이를 끝으로 돌아갈 경우 돌의 합이 짝수로 창영이가 승
		//하지만 돌의 개수가 홀수인 경우 상근이 차례에서 게임이 끝남으로 상근이가 승
		//돌의 개수가 홀수이면 상근이가 승, 짝수이면 창영이가 승
		
		if(stoneNum%2==0) {
			System.out.println("CY");
		}else {
			System.out.println("SK");
		}
		
		

	}

}
