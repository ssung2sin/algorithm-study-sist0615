package Week1;

import java.util.Scanner;

public class A24265 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		
		//코드1의 수행횟수는 중첩for문을 수행하는 횟수
		//i=1, j=2~n=>n-1
		//i=2, j=3~n=>n-2
		//i=n-1, j=n~n=1
		//1+2+...+n-1까지의 합
		//count=(n-1)*n/2
		
		Long count=(n-1)*n/2;
		int degree=2;
		
		System.out.println(count);
		System.out.println(degree);
	}

}
