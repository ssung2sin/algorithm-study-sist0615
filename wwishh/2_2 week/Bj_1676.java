package baekjoon;

import java.util.Scanner;

public class Bj_1676 {

	static int zeroCount(int n) {
		int cnt = 0;
		
		for(int i=n; i>0; i--) {
			int temp = i;
			while (temp%5==0) { //5의 배수마다 0의 개수 증가
				cnt++;
				temp/=5;
			}
				
		}
	
		return cnt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = zeroCount(n);
		
		System.out.println(result);
	}

}
