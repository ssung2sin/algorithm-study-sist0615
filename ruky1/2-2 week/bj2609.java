package bj;

import java.util.Scanner;

public class bj2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int max = Math.max(N, M);
		int min = Math.min(N, M);
		int a = max;
		int b = min;
		
		while(a % b != 0) {
			int c = a;
			a = b;
			b = c % b;
		}
		System.out.println(b);
		
		int i = max;
		while(max % min != 0) {
			max += i;
		}
		System.out.println(max);
	}

}
