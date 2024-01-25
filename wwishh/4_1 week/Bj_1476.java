package baekjoon;

import java.util.Scanner;

public class Bj_1476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int earth = sc.nextInt();
		int sun = sc.nextInt();
		int moon = sc.nextInt();
		
		
		int e = 0;
		int s = 0;
		int m = 0;
		
		int year = 0;
		
		while(true) {
			e++;
			s++;
			m++;
			
			year++;
			
			if(e>15)
				e = 1;
			if(s>28)
				s = 1;
			if(m>19)
				m = 1;
			
			if(e==earth&&s==sun&&m==moon)
				break;
		}
		
		System.out.println(year);
	}

}
