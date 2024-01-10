package bj;

import java.util.Scanner;

public class bj5086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		while(a!=0&&b!=0) {
			if(b%a==0) {
				System.out.println("factor");
			}else if(a%b==0) {
				System.out.println("multiple");
			}else {
				System.out.println("neither");
			}
			
			a=sc.nextInt();
			b=sc.nextInt();
		}
	}

}
