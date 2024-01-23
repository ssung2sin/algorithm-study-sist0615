package algorithm_3Week._1;

import java.util.Scanner;

public class BJ9655 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();			// 돌의 갯수
		// 돌의 갯수가 1개일땐 선공 승
		// 돌의 갯수가 2개일땐 후공 승
		// 돌의 갯수가 1개일땐 선공 승
		// 돌의 갯수가 1개일땐 후공 승
		// 돌의 갯수가 1개일땐 선공 승
		// ... => 돌의 갯수가 홀수일 경우 선공 승
		
		if (n % 2 ==0) {
			System.out.println("CK");
		} else {
			System.out.println("SK");
		}
	}

}
