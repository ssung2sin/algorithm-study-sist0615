package baekjoon.week2_2;

import java.util.ArrayList;
import java.util.Scanner;

public class A1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 소수 구하기 문제
		// M이상 N이하의 소수를 모두 출력_(1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=m;i<=n;i++) {
			for(int j=2;j<i;j++) {
				
				if(i%j==0) {
					break;
				}else{
					if(j==i-1) {
						arr.add(i);
					}
				}
			}
		}
		
		if(m>=1 && m<=2) {
			arr.add(0,2);
		}
		
		//개행 출력
		for(int prime : arr) {
			System.out.println(prime);
		}
		
	}

}
