package baekjoon.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class A5086 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//약수,배수,소수 문제
		//약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) { //whie(true)가 무한루프(무조건 그냥 반복하라는 조건식!)라서 br.readLine()이 끝나지 않음
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			String result;
			
			if(A==0 && B==0) { //while문 안에 있기에 br.readLine()메소드가 끝나는 조건식을 줘야 런타임 에러가 발생하지 않음
				break;
			}
			
			if(A<B && B%A==0) {
				result = "factor";
			}else if(A>B && A%B==0) {
				result = "multiple";
			}else {
				result = "neither";
			}
			
			System.out.println(result);
		
		}
		
	}
}
