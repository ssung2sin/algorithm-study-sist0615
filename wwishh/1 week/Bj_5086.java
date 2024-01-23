package baekjoon;

import java.util.Scanner;

public class Bj_5086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			if(n==0&&m==0)
				break;
			else {
				if(m%n==0)
					System.out.println("factor");
				else if(n%m==0)
					System.out.println("multiple");
				else if(m%n!=0 && n%m!=0)
					System.out.println("neither");
			}
			
		}
	
	}

}
