package baekjoon;

import java.util.Scanner;

public class Bj_2609 {

	static int euclidean(int x, int y) {
		
		int gcd = 0; //최대공약수(GCD, Greateast Common Division)
		int temp = 0;
		
		while (true) {
			if (x % y == 0) {
				gcd = y;
				break;
			}
				
			temp = y;
			y = x%y;
			x = temp;
		}
		
		return gcd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int gcd = 0; //최대공약수(GCD, Greateast Common Division)
		int lcm = 0 ;//최소공배수(LCM, Least Common Multiple)

		if (x > y)
			gcd = euclidean(x, y);
		else
			gcd = euclidean(y, x);
		
		lcm = x*y / gcd; //두 자연수의 곱 = 최대공약수 * 최소공배수
		
		System.out.println(gcd);
		System.out.println(lcm);
	}

}
