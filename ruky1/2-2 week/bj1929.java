package bj;

import java.util.Scanner;

public class bj1929 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int M =sc.nextInt();
		int N =sc.nextInt();
		
		boolean[] arr= new boolean[N + 1];
		StringBuilder sb = new StringBuilder();
		
		arr[0] = true;// 0은 소수가 아님 초기값
		arr[1] = true;// 1은 소수가 아님 초기값
		
		for(int i = 2; i * i <= N; i++) {
			
			if(!arr[i]) {//소수일 경우
				
				for(int j = i * i; j <= N; j += i) {
					arr[j] = true; //소수들의 배수 저장
				}
			}
		}
		
		for(int i=M;i<=N; i++) {
			if(!arr[i])sb.append(i).append("\n");
		}
		
		System.out.println(sb);
	}
}
