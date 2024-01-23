package bj;

import java.util.Scanner;

public class bj9095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Dynamic_Programming = new int[11];
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		Dynamic_Programming[1] =1; //초기 값 초기화
		Dynamic_Programming[2]=2;
		Dynamic_Programming[3]=4;
		
		for(int j=4;j<=10;j++) { // 4부터 반복
			Dynamic_Programming[j] = Dynamic_Programming[j-3] + Dynamic_Programming[j-2] + Dynamic_Programming[j-1]; // 점화식
		}
		
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			
			System.out.println(Dynamic_Programming[n]);
		}
	}

}
