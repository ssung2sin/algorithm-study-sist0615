package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2745 {
	
	public static void main(String [] args) throws IOException {
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		//한줄에 쓰고 읽을 땐 st.nextToken()
		StringTokenizer st=new StringTokenizer(bf.readLine());

			String N=st.nextToken();
			int B=Integer.parseInt(st.nextToken());

			int a=Change_N(N, B);
			
			System.out.println(a);
			
			
	}
	//static을 붙여 정적메서드로 만들어준다. -> 객체 인스턴스에 의존하지 않게 하기 위해
	//그냥 public int 형태의 메서드로 만들면 인스턴스의 메서드가 되기 때문에 -> 클래스의 객체를 생성해야 메서드를 호출할 수 있게됨
	//정적메서드를 사용하면 클래스의 객체를 생성하지 않고도 메서드를 직접 호출할 수 있다.
	public static int Change_N(String N,int B) {
		
		int ch_N=0;
		
		//abcde면 5번 돌림
		//처음 : 5-0-1 = 4번째 index값 e / 두번째 : 5-1-1=3번째 index 값 d ... 
		for(int i=0; i<N.length(); i++) {

			//예를들어, N이 '12345'라면 '5'의 10진수 53으로 ch에 저장
			char ch=N.charAt(N.length()-i-1); // 이 상태에서만 출력하면 마지막값인 a의 10진법이 나옴
			
			//isDigit() : Character클래스의 메서드 ->()안의 값이 숫자인지 문자인지 판단
			//()값이 숫자라면 true를 반환, 문자라면 false를 반환
			//10진법에서는 '0'~'9'까지의 문자를 나타내기 위해 0부터 9까지의 숫자를 사용 
			//그러나 알파벳 문자를 10진법으로 나타낼 때는 'A'부터 'Z'까지를 10~35까지 숫자로 표현
			// '0'=48,'1'=49,'2'=50... -> 문자'N'에 대한 아스키 코드
			// 'A'=65, 'B'=66, 'C'=67...
			int value=Character.isDigit(ch)?(ch-'0'):(ch-'A'+10); //보정값 +10
			
			//Math.pow(진법,승)
			//ex)6491=6000+400+90+1 -> 형준오빠가 올려준 블로그 참고
			//	(6*1000)+(4*100)+(9*10)+(1*1)
			//	(6*10^3)+(4*10^2)+(9*10^1)+(1*10^0)
			ch_N+=Math.pow(B, i)*value;
		}
		
		return ch_N;
	}

}
