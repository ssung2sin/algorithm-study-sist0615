package bj_2024;

import java.util.Scanner;

public class bj_1476 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int e = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();
		
		junkyu(e,s,m);

	}

	private static void junkyu(int e, int s, int m) {

		int E = 0;
		int S = 0;
		int M = 0;
		int year = 0;
		
		while(true) {
			year++;
			E++;
			S++;
			M++;
			if(E == 16) {
				E = 1;
			}
			if(S == 29) {
				S = 1;
			}
			if(M == 20) {
				M = 1;
			}
			if(E == e && S == s && M == m) {
				System.out.println(year);
				break;
			}
		}
		
	}

}

