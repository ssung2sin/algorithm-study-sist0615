package bj;

import java.util.Scanner;

public class bj2745 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int b = sc.nextInt();
		int tmp = 1;
		int sum = 0;
		
		for(int i=n.length()-1;i>=0;i--) { 
			char c = n.charAt(i); //첫쨰 자리 부터 계산
			
			if(65<=c&&c<=90){  // A<=c&&c<=Z
				sum +=(c-65+10)* tmp;
			}else {
				sum +=(c-'0')*tmp;
			}
			tmp *= b; //
		}
		
		System.out.println(sum);
		
		
		
		
	}

}