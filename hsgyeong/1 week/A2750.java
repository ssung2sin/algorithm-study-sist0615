package practice;

import java.util.Arrays;
import java.util.Scanner;

public class A2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int num:arr)
		
		System.out.println(num);
	}

}
