package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_24265 {
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		long result = 0;
		
		for(long i=n-1;i>0;i--)
			result += i;
		
		System.out.println(result);
		System.out.println(2); //알고리즘에 사용되는 for문의 갯수
	}

}
