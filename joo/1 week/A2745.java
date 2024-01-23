package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2745 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//B진법 수 N을 10진법으로 출력한다.
		//ZZZZZ 36  =>  60466175

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader는 한번에 입력값 모두에 enter 적용 가능
		//Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(br.readLine()); //Java의 BufferedReader클래스에 속한 메소드 중 하나, 텍스트 기반 inputStream에서 한 줄 읽어오는 역할 + IOException(Input/Output)의 예외처리 필수
		String N = st.nextToken(); //나눠진 토큰 중에서 다음 토큰을 반환하는 것을 의미
		int B = Integer.parseInt(st.nextToken()); //왜 N이 못 올까?_공백이 있을 경우 NuberFormatException이 발생해서 안전하지 않은 방법
		int sum=0;
		
		
		int [] result = new int[N.length()]; //입력받은 길이만큼의 배열 크기의 result라는 배열을 만들어줌 
		
		for(int i=0; i<N.length();i++) {
			char ch = N.charAt(i);
			//System.out.println(ch);
			int value;
			if(ch >= 'A' && ch <='Z') {  //컴파일할 때, 아스키코드 A는 65로 인식되기 때문
				value = ch-'A'+10;  //A는 65임 , A=10,B=11...Z=35
			}else {
				value = Character.getNumericValue(ch);  //char()를 int형으로 바꿔주는 것
			}
			sum +=value*Math.pow(B,(N.length()-(i+1)));
		}
		
		System.out.println(sum);
		
	
	}

}