package Week2_2;

import java.util.Scanner;

//팩토리얼
public class A10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//입력받은 수 		
		//n!=1*2*....*n;
		
		long factorial=1;
		
		for(int i=1; i<=n; i++) {
			factorial*=i;
		}
		
		System.out.println(factorial);

	}

}
