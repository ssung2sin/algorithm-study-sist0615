package baekjoon;

import java.util.Scanner;

public class A2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int [] numbers = new int[] {a,b,c};
		int max = numbers[0]; //최대값
		/*
		 * 최빈값으로 풀고 싶었으나 실패
		 * int mode = 0; //최빈값 int [] index =new int [numbers.length]; int count = 0;
		 */
	
		//최대값 뽑기
		for(int i=0; i<numbers.length; i++) {
				if(numbers[i]>max) {
					max = numbers[i];
				}
			}
			/*
			 * for(int i=0; i<index.length;i++) { if(max<index[i]) { mode=i; count++; } }
			 */

		
		if(a==b && b==c && c==a) {
			int result1 = 10000+(a)*1000;
			System.out.println(result1);
		}else if(a==b || b==c || c==a) {
			if(a==b || a==c) {
				int result2 = 1000+(a)*100;
				System.out.println(result2);
			}else if(b==a || b==c) {
				int result2 = 1000+(b)*100;
				System.out.println(result2);
			}else if(c==a || c==a) {
				int result2 = 1000+(c)*100;
				System.out.println(result2);
			}
		}else {
			int result3= max*100;
			System.out.println(result3);
		}
	}

}
