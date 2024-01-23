package algorithm_2Week_2;

import java.util.Scanner;

public class BJ10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();			// 입력받은 값
		
		int fact = 1;					// 팩토리얼의 기본값 1
		
		for(int i = 1; i <= n; i++) {
			fact *= i;
		}
		
		System.out.println(fact);
	}
	
}
