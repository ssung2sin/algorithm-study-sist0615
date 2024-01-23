package Week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//n장의 카드를 받음
		int m=sc.nextInt();//카드 3장의 합이 m을 넘지않아야 됨
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}		
		
		int max=0;
		int total=0;
		
		for(int a=0; a<list.size(); a++) {
			for(int b=1; b<list.size(); b++) {
				for(int c=2; c<list.size(); c++) {
					
					if(a!=b&&a!=c&&b!=c) {
						total=list.get(a)+list.get(b)+list.get(c);
					}					
					
					if(m>=total) {
						max=(max>total)?max:total;
					}
					
				}
			}
		}
		
		System.out.println(max);
		
	}

}
