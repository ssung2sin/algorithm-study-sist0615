package bj;

import java.util.Scanner;

public class bj10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		int sum = factorial(num);
		System.out.print(sum);
	}
	
	
	public static int factorial(int num) {
		if(num <= 1) {
			return 1; //종료
		}
		
		return num * factorial(num-1);
	}
}
