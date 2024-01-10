package example;

import java.util.Scanner;

public class Bj_2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[3];
		
		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		
		int reword = 0;
		int max = 0;
		
		if(arr[0]==arr[1]&&arr[1]==arr[2]) 
			reword = 10000 + arr[0]*1000;
		else if((arr[0]==arr[1]&&arr[1]!=arr[2])||(arr[0]==arr[2]&&arr[1]!=arr[2]))
			reword = 1000+arr[0]*100;
		else if(arr[1]==arr[2]&&arr[0]!=arr[2])
			reword = 1000+arr[1]*100;
		else if(arr[0]==arr[1]&&arr[1]!=arr[2])
			reword = 1000+arr[0]*100;
		else if(arr[0]!=arr[1]&&arr[1]!=arr[2]) {
			for(int i=0; i<arr.length; i++) {
				if(max<arr[i]) {
					max = arr[i];
					reword = max * 100;
				}
					 
			}
		}
		
		System.out.println(reword);
			
	}

}
