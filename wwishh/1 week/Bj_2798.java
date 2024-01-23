package baekjoon;

import java.util.Scanner;

public class Bj_2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] x = new int[n];

		int sum = 0;
		int result = 0;

		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}

		for (int i = 0; i < x.length - 2; i++) {
			for (int j = i+1; j < x.length - 1; j++) {
				for (int k = j+1; k < x.length; k++) {
					if (k < n) {
						sum = x[i] + x[j] + x[k];
						if (sum > result && sum <= m)
							result = sum;
					}

				}
			}
		}

		System.out.println(result);

	}

}
