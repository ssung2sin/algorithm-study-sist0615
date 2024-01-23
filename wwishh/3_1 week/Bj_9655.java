package baekjoon;

import java.util.Scanner;

public class Bj_9655 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int stone = sc.nextInt();
		
		// 1 sk 2cy 3 sk 4 cy 5 sk  6 cy 7 sk
		if(stone%2==0)
			System.out.println("CY");
		else if(stone%2==1)
			System.out.println("SK");
	
	}

}
