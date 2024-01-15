package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A1929 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());

		int start=Integer.parseInt(st.nextToken());
		int end=Integer.parseInt(st.nextToken());
		//int range=start-end; //범위

		//end가 120면 0부터 시작하니까 119까지임 ,end+1해줘야 120개됨
		//기본값 false
		boolean primeNum [] = new boolean [end+1]; 

		//System.out.println(primeNum[end]);

		primeNum[0]=true; //0
		primeNum[1]=true; //1

		//System.out.println(primeNum[end]);

		//end=30 i=2,3,4,5,6,7....30
		for(int i=2; i*i<=end; i++)  {
			if(!primeNum[i]) { //진실


				//j=i*i부터 시작 ex)end=30 i=2일때 , j=4,6,8,10,12...30
				for(int j=i*i; j<=end; j+=i) { //i=2 j+=i j=i의배수
					primeNum[j]=true;
				}
			}
		}
		//소수배열의 i번지 값들을 출력하기만하면 끝~
		for(int i=start; i<=end; i++) {
			//2 3 5 7 11 13 15 17 19 23 29
			if(!primeNum[i]) {
				System.out.println(i);
			}
		}
	}

	//요약 
	//1.배수를 입력할 숫자를 구한다! ex) end가 30이면 i의 제곱이 end 이하일때까지 포문이 돌아감 i=2,3,4,5,6,7...30
	//2.두번째 포문을 보면 j=i*i 부터 시작해서 j에 i를 누적시킨다. i=2일때 j=4,6,8,10,12....
	//3.즉 i=2면 2의배수들을 구하고 i=3이면 3의배수들을 구한다고보면된다, 소수배열의 i번지 값들을 출력하기만하면 끝~
}
