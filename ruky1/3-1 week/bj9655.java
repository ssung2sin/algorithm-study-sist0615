package bj;

import java.util.Scanner;

public class bj9655 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] Dynamic_Programming = new int[1001];
		Dynamic_Programming[1] = 1;
		Dynamic_Programming[2] = 2;
        Dynamic_Programming[3] = 1;
        for (int i = 4; i <= N; i++) {
            Dynamic_Programming[i] = Math.min(Dynamic_Programming[i-1],Dynamic_Programming[i-3]) + 1;
        }
        if (Dynamic_Programming[N] % 2 == 0) {
            System.out.print("CY");
        } else {
            System.out.print("SK");
        }
	}

}
