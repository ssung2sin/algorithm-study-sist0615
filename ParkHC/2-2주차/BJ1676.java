package algorithm_2Week_2;

import java.util.Scanner;

public class BJ1676 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int fact = 1;	// 팩토리얼의 기본값 1
		int count = 0;
		
		for(int i = 1; i <= n; i++) {
			fact *= i;
		} while(fact % 10 == 0) {
			count++;
			fact /= 10;
		}
		
		System.out.println(count);
	}

}
