package baekjoon.week4_1;

import java.util.Scanner;

public class A1476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 날짜 계산 _ 연도 방식 15 28 19 
		// 준규가 사는 나라에서 E S M이 우리가 알고 있는 연도로 몇 년인지 구하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		int e = 1;
		int s = 1;
		int m = 1;
		int count = 1;
		
		while(true) {
			if(E==e && S==s && M==m) {
				break;
			}
			e++;
			s++;
			m++;
			
			if(e==16) {
				e=1;
			}
			if(s==29) {
				s=1;
			}
			if(m==20) {
				m=1;
			}
			
			count++;
		}
		
		System.out.println(count);

	}

}
