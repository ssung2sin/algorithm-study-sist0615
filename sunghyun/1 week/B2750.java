package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int arr[]=new int[N];
		
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
