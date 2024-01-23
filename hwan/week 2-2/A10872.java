package Baekjoon;

import java.util.Scanner;

public class A10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int facNum=sc.nextInt();
		/*int factorial=1;

		for(int i=1; i<=facNum; i++) {

			factorial*= i;
		}
		System.out.println(factorial);*/	
		
		System.out.println(fact(facNum));
	}

	//재귀함수
	public static int fact(int facNum) {
		if (facNum <= 1)			
			return 1;	
		else{		
			return fact(facNum-1) * facNum;	
		}	
	}
}
