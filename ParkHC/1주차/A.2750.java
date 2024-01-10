package algorithm_1Week;

import java.util.Arrays;
import java.util.Scanner;

public class arrNum {
//Q. 2750번 / 성공
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
