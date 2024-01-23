package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class A1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fact(N));
		
		String fact=fact(N).toString();
		
		int zeroNum=0; //0의개수
		
		for (int i =fact.length()-1; i > 0; i--) {            
			
			if(fact.charAt(i)!='0') {
				break;
			}else {
				zeroNum++;
			}
			
		}
		
		System.out.println(zeroNum);
	}

	public static BigInteger fact(int N) {
		
		if(N<=1) {
			return BigInteger.ONE;
		}else {
			return BigInteger.valueOf(N).multiply(fact(N-1));
		}
		
		//BigInteger bigNum1 = BigInteger.ZERO;  // 0    
		//BigInteger bigNum2 = BigInteger.ONE;   // 1    
		//BigInteger bigNum3 = BigInteger.TEN;   // 10    
		//BigInteger afterBigNum;      
		
		// 사칙연산    
		//afterBigNum = bigNum1.add(bigNum3);        // 더하기    
		//afterBigNum = bigNum3.subtract(bigNum2);    // 빼기    
		//afterBigNum = bigNum2.multiply(bigNum3);    // 곱하기    
		//afterBigNum = bigNum3.divide(bigNum2);        // 나누기     
		
		// 변수와 사칙연산    
		//afterBigNum = bigNum1.add(BigInteger.valueOf(i));        // 더하기    
		//afterBigNum = bigNum1.subtract(BigInteger.valueOf(i));    // 빼기    
		//afterBigNum = bigNum1.multiply(BigInteger.valueOf(i));    // 곱하기    
		//afterBigNum = bigNum1.divide(BigInteger.valueOf(i));    // 나누기
	}
	

}
