package Week2_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

//팩토리얼(재귀),BigInteger
public class A1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		BigInteger factorial = new BigInteger("1");
		
		for(int i=1; i<=n; i++) {
			BigInteger j = new BigInteger(String.valueOf(i));
			factorial=factorial.multiply(j);
		}
		
		//System.out.println(factorial);
		

		String[] factorial_arr =(String.valueOf(factorial)).split("");
		
		int zeroCount = 0;
		
		//배열의 가장 뒤에 부터 탐색
		for(int i=factorial_arr.length-1; i<factorial_arr.length; i--) {
			
			if(factorial_arr[i].equals("0")) {				
				zeroCount++;
				
			}else {				
				break;
				
			}
		}
		
		System.out.println(zeroCount);
		
		/*for(String digit: factorial_arr) {
			System.out.println(digit);
		}*/
		
	}

}
