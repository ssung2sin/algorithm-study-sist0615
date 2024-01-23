package algorithm_1Week;

import java.util.Scanner;

public class Complexity {
//  Q.24265 / 성공
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Long n = sc.nextLong();
		Long result = n*(n-1)/2;
		
        // System.out.println(result + "\n" + 2);
        System.out.println(result);
        System.out.println(2);
	}

}
