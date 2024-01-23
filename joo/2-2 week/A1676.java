package baekjoon.week2_2;

import java.math.BigInteger;
import java.util.Scanner;

public class A1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 팩토리얼로 출력한 결과값의 마지막자리가 0일때부터 처음 0이 아닌 숫자가 나올 때의 0의 개수
		// int를 쓰고 싶은데 숫자가 너무 커질 땐 BigInteger를 사용할 수 있음 (참고_https://coding-factory.tistory.com/604)

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		BigInteger result = factorial(n);
		
		//0의 개수 출력
		int zeroCount = result_search(result);
		
		System.out.println(zeroCount);
	}
	
	private static BigInteger factorial (int i) {
		
		BigInteger bigNumber1 = BigInteger.ONE; //1
		//BigInteger 메소드 zero/one/ten 3가지 있음
		BigInteger bigNumber2 = BigInteger.valueOf(i);
		//int형 -> BigInteger가 되기 위해서는 .valueof(); 사용하기.
		//예) 형변황 _ BigInteger bigNumber = BigInteger.valueOf(100000); //int -> BigIntger
		
		if(i <= 1) {
			return bigNumber1;
		}else {
			return bigNumber2.multiply(factorial(i-1));

		}
	}
	
	//0의 개수 세기 위한 함수
	private static int result_search(BigInteger result) {
		
		String resultString=result.toString(); //result : BigInteger -> String 타입으로 형변환
		int count = 0;
		
		for(int i=resultString.length()-1;i>=0;i--) {
			if(resultString.charAt(i)== '0') {
				count++;
			}else {
				break;
			}
			
		}

        return count;
    }
	
}

