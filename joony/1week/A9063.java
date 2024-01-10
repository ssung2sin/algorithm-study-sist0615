package Week1;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A9063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//방법1.
		/*int[] x1 = new int[n];
		int[] y1 = new int[n];
		
		for(int i=0; i<n; i++) {
			x1[i]=sc.nextInt();
			y1[i]=sc.nextInt();
		}
		
		int x_max=x1[0];
		int x_min=x1[0];
		int y_max=y1[0];
		int y_min=y1[0];
		
		for(int j=0; j<n; j++) {
			//x_max=Math.max(x_max, x1[j]);
			x_max=(x_max>x1[j])?x_max:x1[j];
			x_min=(x_min<x1[j])?x_min:x1[j];
			y_max=(y_max>y1[j])?y_max:y1[j];
			y_min=(y_min<y1[j])?y_min:y1[j];
		}
		
		int square = (x_max-x_min)*(y_max-y_min);
		System.out.println(square);*/
		
		//방법2.
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		
		
		for(int i=0;i<n;i++) {
			x.add(sc.nextInt());
			y.add(sc.nextInt());
		}
		
		int max_x=Collections.max(x);
		int min_x=Collections.min(x);
		
		int max_y=Collections.max(y);
		int min_y=Collections.min(y);
		
		int square=(max_x-min_x)*(max_y-min_y);
		
		System.out.println(square);
		

	}

}
