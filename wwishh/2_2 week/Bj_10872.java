package baekjoon;

import java.util.Scanner;

public class Bj_10872 {

	static int factorial(int x) {

		int fac = 1;

		for (int i = x; i > 0; i--)
			fac *= i;
		return fac;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int result = factorial(n);

		System.out.println(result);
	}

}
