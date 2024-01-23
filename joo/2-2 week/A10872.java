package baekjoon.week2_2;

import java.util.Scanner;

public class A10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//팩토리얼 문제
		//재귀함수로 푸는 문제 (https://marobiana.tistory.com/79 참고)
		//입력 : 10
		//출력 : 3628800
		//입력 : 0
		//출력 : 1
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
	}
	
	public static int factorial(int i) {
		if(i <= 1) {
			return 1;
		}else {
			return i*factorial(i-1);
			//ex. 10이면
			//f(10)= 10*f(9)
			//f(9)=9*f(8)
			//...
			//f(2)=2*f(1)
			//f(1)=1;
		}
	}

}
