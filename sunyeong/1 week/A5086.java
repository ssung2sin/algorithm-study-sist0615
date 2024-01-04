package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A5086 {

	public static void main(String[] args) {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		//StringBuilder : 가변적인 크기의 문자열을 처리하면서, 여러개의 결과를 출력할 때 사용
		//문자열 연산이 필요한 경우 문자열의 수정이 아닌 버퍼에 추가하여 성능 향상
		StringBuilder sb=new StringBuilder();
		
		//while문 쓴 이유 : 여러개의 테스트 케이스를 입력받아야 하고, 0 0 일 시 break를 사용하기 위해
		while(true) {
		try {
			StringTokenizer st=new StringTokenizer(bf.readLine());
			
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			//if(a==0 && b==0)이 약수배수 조건검사보다 아래에 있으면 무한루프 오류 발생
			//종료 조건을 먼저 확인하고 조건을 달아야함 왜냐면 참일 때 while문이 계속 도는데, 
			//0 0 입력을 하고 또 while문이 돌면서 약수, 배수 조건을 확인하기 때문에
			if(a==0 && b==0) {
				break;
			}
			
			if(b%a==0) {
				sb.append("factor\n"); //append는 StringBuilder의 메서드 값들을 추가해 놓는다.
			}else if(a%b==0) {
				sb.append("multiple\n");
			}else {
				sb.append("neither\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		System.out.println(sb.toString()); //StringBuilder에 추가해놓은 값들 출력
	}
}
