package algorithm_4Week_1;

import java.util.Scanner;

public class BJ1476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int e = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();
		
		int earth = 0;
		int sun = 0;
		int moon = 0;
		int year = 0;
		
		while(true) {
			earth++;
			sun++;
			moon++;
			year++;
			
			if(earth > 15) {
				earth = 1;
			}
			if(sun > 28) {
				sun = 1;
			}
			if(moon > 19) {
				moon = 1;
			}
			if(e == earth && s == sun && m == moon) {
				break;
			}
		}
		System.out.println(year);
	}

}
