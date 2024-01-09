package baekjoon.week1;

import java.util.Scanner;

public class A9063 {

    public static void main(String[] args){

    	//대지 구하는 문제
    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int [] x = new int[N];
    	int [] y = new int[N];
    	
		for(int i=0;i<N;i++) { 
			x[i]= sc.nextInt();
			y[i]= sc.nextInt();
		 }
		
		int maxX=x[0];
		int minX=x[0];
		int maxY=y[0];
		int minY=y[0];
		
		
		//max와 min의 기준점을 계속 바꿔서 값을 넣어주기
		for(int i=0;i<N;i++) {
			maxX=(maxX>x[i])?maxX:x[i]; //같은말,, maxX=Math.max(maxX,x[i]);
			minX=(minX<x[i])?minX:x[i];
			maxY=(maxY>y[i])?maxY:y[i];
			minY=(minY<y[i])?minY:y[i];
		}
		
		int square = (maxX-minX)*(maxY-minY);
		System.out.println(square);
		

    }
}
