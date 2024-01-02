package baekjoon;

import java.util.Scanner;

public class Bj_2745 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		int b = sc.nextInt();

		int x = 0;
		int cnt = 0;

		for (int i = n.length() - 1; i >= 0; i--) {
			if (n.charAt(i) >= 65) {
				x += (n.charAt(i) - 'A' + 10) * Math.pow(b, cnt);
				cnt++;
			} else {
				x += ((int)n.charAt(i) - '0') * Math.pow(b, cnt);
				cnt++;
			}
		}

		System.out.println(x);
	}

}
