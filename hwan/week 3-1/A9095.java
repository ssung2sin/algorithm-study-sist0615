package Baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class A9095 {

	public static void main(String[] args) throws IOException   {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int dp[] = new int [11];  //예제 입력을 보면 10			
		int T = sc.nextInt(); //for문 몇개돌릴건지
		//2^(n-1)
		dp[1]=1; //1 자기자신
		dp[2]=2; //1,1  2
		dp[3]=4; //1,1,1  1,2  2,1  3

		dp[4]=7; //1,1,1,1  1,2,1  1,1,2  2,1,1  2,2  1,3  3,1		
		dp[5]=13; //dp[2]+dp[3]+dp[4]
		for(int j=4;j<dp.length;j++) { // 4부터
			dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
		}

		for(int i=0;i<T;i++) {
			int n = sc.nextInt();

			bw.write(dp[n]+"\n");
		}
		bw.flush();
		bw.close();
	}


}
