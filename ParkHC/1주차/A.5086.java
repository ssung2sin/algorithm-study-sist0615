package algorithm_1Week;

import java.util.Scanner;

public class MultiplesAndDivisors {
// Q.5086 / 성공
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a == 0 && b == 0) {
				break;
			}
			Answer(a, b);
		}
		sc.close();
	}
	
	public static void Answer(int a,int b) {
		if (b % a == 0) {
			 System.out.println("factor");
		} else if (a % b == 0) {
			System.out.println("multiple");
		} else{
			System.out.println("neither");
		}
	}
}
