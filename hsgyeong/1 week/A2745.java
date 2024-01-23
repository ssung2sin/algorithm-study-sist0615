package practice;

import java.util.Scanner;

public class A2745 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String N;
		int B;
		int n = 0;
		int answer = 0;

		N = sc.next();
		B = sc.nextInt();

		for (int i=0; i<N.length(); i++) {
			char a = N.charAt(i);
			if (a >= '0' && a <= '9') {

				n = n*B + (a-'0');

			} else {

				n = n*B + (a-'A'+10);
			}
		}
		answer = n;

		System.out.println(answer);
	}

}