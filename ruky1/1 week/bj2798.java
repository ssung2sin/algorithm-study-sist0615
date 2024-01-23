package bj;

import java.util.Scanner;

public class bj2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		int result=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-2;i++) {
			for(int j=(i+1);i<n-1;j++) {
				for(int x=(j+1);x<n;x++) {
					int sum=a[i]+a[j]+a[x];
					if(sum<=m) {
						result=Math.max(sum, result); //값의 더높을경우 저장
					}
				}
			}
		}
		System.out.println(result);
	}

}
