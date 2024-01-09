package baekjoon.week1;

import java.util.Arrays;
import java.util.Scanner;

public class A2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오름차순 정렬문제
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array [] = new int[n];
		
		//배열의 값 1개씩 담기
		for(int i=0;i<array.length;i++) { 
			array[i] = sc.nextInt(); 	
		}
		
		//오름차순 정렬하기
		Arrays.sort(array);
		
		//오름차순 정렬된 건 출력하기
		//for-each문
		//array를 sortN이라는 변수에 넣고 계속 반복한다.
		for(int sortN:array) {
			System.out.println(sortN); //println하면 개행됨.
		}
	}
}
