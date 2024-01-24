package baekjoon.week4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A15649 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// N과 M(1)문제
		// 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열, 1 ≤ M ≤ N ≤ 8
		// 입력 3 1
		// 출력 1		2		3
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] selected = new int[M];
        
		//1~3(1~N개) 2개(M개)
		//n0,n1,n2
		//n0,n1
		//n0,n2
		//n1,n0
		//n1,n2
		//n2,n0
		//n2,n1
		//이런식으로 M개씩 묶어서 배열에 배열을 만들어서 할 수 있는 방법을 생각했으나 코드로 못 짰습니다. 


	}

}
