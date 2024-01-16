package Baekjoon;

import java.util.Scanner;

public class A9655 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int stone=sc.nextInt(); //돌의개수
		// 게임은 상근이가 먼저 시작한다.
		//1.상근 3개 2.창영 3개 3.상근 2개 4.창영 2개 (o)
		//1.상근 1개 2.창영 3개 3.상근 2개 4.창영 2개 5.상근 2개 (x)
		// 아 두사람이 완벽하게 게임을했을때..

		//돌을 총 2명이서 나누는데 나머지가 생기면
		if(stone%2==0) {
			System.out.println("CY");
		}else {
			System.out.println("SK");
		}

	}

}
