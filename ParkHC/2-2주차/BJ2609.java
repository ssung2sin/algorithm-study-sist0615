package algorithm_2Week_2;

import java.util.Scanner;

public class BJ2609 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1  = sc.nextInt();
		int num2  = sc.nextInt();
		
		int Divisor = 0;								// 최대공약수
		int Multiple = 0;								// 최소공배수
		
		for(int i = 1; i <= num1 && i <= num2; i++) {	// 입력받은 값 num1과 num2보다 작고
			if(num1 % i == 0 && num2 % i == 0) {		// i로 나누었을때 공통으로 나머지가 0인 값을
				Divisor = i;							// 최대공약수로 지정
			}
		}
		
		Multiple = (num1 * num2) / Divisor;				// 입력받은 값 num1과 num2를 곱하고 최대공약수로 나누어서 최소공배수를 구함
		
		System.out.println(Divisor);
		System.out.println(Multiple);
	}
	
}

