package Week2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//최대공약수(유클리드 호제법), 최대공배수
public class A2609 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int firstNum = Integer.parseInt(st.nextToken());
		int secondNum = Integer.parseInt(st.nextToken());
		
		//최대공약수(MaxComDivisor): 두 개 이상의 정수의 가장 큰 공통 약수=>유클리드 호제법
		//최소공배수(MinComMultiple): 두 개 이상의 정수의 공배수 중 가장 작은 수
		//MaxComDivisor, MinComMultiple;
		
		if(firstNum<secondNum) {
			int tmp = firstNum;
			firstNum=secondNum;
			secondNum=tmp;
		}
		
		//System.out.println(firstNum+","+secondNum);
		int maxComDivisor = maxComDivisor(firstNum,secondNum);
		long minComMultiple = minComMultiple(firstNum, secondNum, maxComDivisor);
		System.out.println(maxComDivisor+"\n"+minComMultiple);

	}
	
	//최대공약수 메서드
	public static int maxComDivisor(int firstNum, int secondNum) {
		//48 ÷ 18 = 2, 나머지 12
		//18 ÷ 12 = 1, 나머지 6
		//12 ÷ 6 = 2, 나머지 0
		//나머지가 0이 나올 때 나눠준 나머지가 최대공약수
		
		//int leaf = firstNum%secondNum;
		
		//나머지가 1이면 서로수인 두 수, 0이라면 그 때의 나머지는 최대공약수
		while(secondNum!=0) {
			int tmp = secondNum;//tmp에 나누는 수 임시저장
			secondNum = firstNum%secondNum;//나머지를 secondNum으로 변경
			firstNum = tmp;//firstNum를 임시저장한 tmp로 변경
		
		}		
		
		//처음으로 나눈 나머지가 0이 될 때의 secondNum이 최대공약수
		return firstNum;
	}
	
	//최소공배수 메서드 
	public static long minComMultiple(int firstNum, int secondNum, int maxComDivisor) {
		
		return (firstNum*secondNum)/maxComDivisor;
	}

}
