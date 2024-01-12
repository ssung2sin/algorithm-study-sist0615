package bj;

import java.util.Scanner;

public class bj1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 0;
		
		while(num >= 5) {
			count += num/5;
			num /=5;
		}
		System.out.println(count);
		
	}

}
