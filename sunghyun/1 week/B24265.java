package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B24265 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		long sum=0;
		long n=Long.parseLong(br.readLine());
		
		sum=(n*(n-1))/2;
		
		System.out.println(sum);
		System.out.println(2);
		br.close();
	}

}

//45분