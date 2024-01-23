package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class B1676 {

	//BigInteger는 무한대 정수 표현가능
	public static BigInteger factorial(int num)
	{
		if(num==0 || num==1)
		{
			//BigInteger result = BigInteger.valueOf("1");
			//return result.add(BigInteger.ONE); 하니까 팩토리얼 값의 * 2가 되었다...return으로 BigInteger.ONE만 하니까 팩토리얼값 출력 완료
			return BigInteger.ONE; //1이라는 의미 그냥 숫자는 오류발
		}
		else
		{
			//기존 factorial은 num*factorial(num-1)하면 되지만 BigInteger는 사칙연산이 안되기 때문에 미리 생성시키고 multiply 메서드를 사용해 factorial(num-1)을 곱해줘야 한
			BigInteger fac=BigInteger.valueOf(num);
			return fac.multiply(factorial(num-1));
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int zeroCnt=0;
		
		//Integer.toString(factorial(num))일땐 함수의 반환값이 BigInteger이기 때문에 BigInteger는 Integer에 호환되지 않아 컴파일 오류발생
		//따라서 함수 안의 BigInteger형태로 num을 계산한뒤 String값으로 변경해주면 에러 발생 없음
		String zero=factorial(num).toString();
		
		int zeroArr[]=new int[zero.length()];
		
		for(int i=zero.length()-1;i>=0;i--)
		{
			zeroArr[i]=zero.charAt(i)-'0';
		}
		
		for(int i=zeroArr.length-1;i>=0;i--)
		{
			if(zeroArr[i]==0)
				zeroCnt++;
			else
				break;
		}
		
		System.out.println(zeroCnt);
	}

}
