package Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A2745 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n = st.nextToken();//주어진 수
		int b = Integer.parseInt(st.nextToken());//b진법
		
		//방법1
		//문자로 받은 수를 b진법으로 형변환
		//System.out.println(Integer.parseInt(n, b));
		
		//방법2
		//대문자 아스키코드 Z=90, 하지만 문제에선 35이므로 55를 빼준다.		
		String[] word = n.split("");
		double[] word2 = new double[word.length];
		int sum=0;
		
		for(int i=0; i<n.length(); i++) {
			//System.out.println(word[i]);
			//문자A~Z이면 55감소
			if((int)word[i].charAt(0)>=65&&(int)word[i].charAt(0)<=90) {
				word2[i] = (int)word[i].charAt(0)-55;
			}else {
				word2[i]=Integer.parseInt(word[i]);
			}						
			//각 문자를 double형으로 변경한 배열에 넣은 후 b의 n.length()-i-1승을 해줌
			word2[i]=word2[i]*Math.pow(b,n.length()-i-1);
			//각 자리수의 값들을 모두 더한다
			sum+=word2[i];
		}
		
		System.out.println(sum);
		
	}

}
