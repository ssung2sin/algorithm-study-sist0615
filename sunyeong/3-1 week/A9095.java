package baekjoon_CodingStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A9095 {
	
	static int [] dp;
	//9095 - 1,2,3 더하기 // 동적계획법은 점화식을 세울 수 있는지 파악하는게 중요해보인다.(바텀-업)
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer buf=new StringBuffer();
		
			int case_count=Integer.parseInt(br.readLine()); //테스트케이스의 갯수
			
			dp=new int[11]; //11보다 작은 양수

			for(int i=0;i<case_count;i++) {
				
				int case_num=Integer.parseInt(br.readLine());
				
				int result_buf=result(case_num);
				buf.append(result_buf).append("\n");
				
	}
			System.out.println(buf);
}
	
	static int result(int case_num) {
		
		
		//case_count의 표현갯수=(case_count-1)표현갯수+(case_count-2)표현갯수+(case_count-3)표현 갯수
		dp[0]=1;  
		dp[1]=1;
		dp[2]=2;
		
		for(int i=3;i<=case_num;i++) {
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		}
		
		return dp[case_num];
	}
}
