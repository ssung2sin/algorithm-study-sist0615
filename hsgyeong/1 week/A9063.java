package practice;

import java.util.Arrays;
import java.util.Scanner;

public class A9063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		int x;
		int y;
			
		N = sc.nextInt();
		
		int arrX [] = new int [N]; 
		int arrY [] = new int [N];
				
		for(int i=0; i<N; i++)
		{
			arrX[i] = sc.nextInt();
			arrY[i] = sc.nextInt();	
		}
		
		Arrays.sort(arrX);
		Arrays.sort(arrY);
		
		int maxX = arrX[0];
		int minX = arrX[arrX.length-1];
		int maxY = arrY[0];
		int minY = arrY[arrY.length-1];
		
		if(N==1)
		{
			x = 0;
			y = 0;

		}	
		else
		{
		x = maxX-minX;
		y = maxY-minY;
		}		
		System.out.println(x*y);
	}

}
