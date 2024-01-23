package bj;

import java.util.Scanner;

public class bj9063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x,y;
		int x_min=10001;
		int x_max=-10001;
		int y_min=10001;
		int y_max=-10001;
		for(int i=0;i<n;i++) {
			System.out.print("x의 좌표");
			x=sc.nextInt();
			System.out.print("y의 좌표");
			y=sc.nextInt();
			if(x>x_max) {
				x_max=x;
			}
			if(x<x_min) {
				x_min=x;
			}
			if(y>y_max) {
				y_max=y;
			}
			if(y<y_min) {
				y_min=y;
			}
		}
		int total=(x_max-x_min)*(y_max-y_min);
		System.out.println(total);
	}

}
