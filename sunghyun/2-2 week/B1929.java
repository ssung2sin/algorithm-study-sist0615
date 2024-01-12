package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B1929 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int first_num=Integer.parseInt(st.nextToken());
		int second_num=Integer.parseInt(st.nextToken());
		
		boolean isPrime []= new boolean[second_num+1];
		
		for(int i=2;i<=second_num;i++)
		{
			isPrime[i]=true;
		}
		
		// 에라토스테네스의 체 알고리즘을 사용하여 소수를 찾아내고, 해당 소수의 배수들을 모두 제거하는 부분
		for(int i=2; i*i<=second_num;i++)
		{
			// i가 소수인 경우에만 실행
			if(isPrime[i])
			{
				// i의 배수들을 모두 제거
		        // 시작은 i의 제곱부터 시작하여, 작은 배수는 이미 이전에 처리되었기 때문
				for(int j=i*i;j<=second_num;j+=i)
				{
					// j는 i의 배수이므로 해당 위치의 수를 소수에서 제외(false로 설정)
					isPrime[j]=false;
				}
			}
		}
		
		// 최종적으로 찾아낸 소수를 출력하는 부분
		// 시작값은 2 또는 입력으로 주어진 첫 번째 숫자 중 큰 값으로 설정
		for(int i=Math.max(2, first_num);i<=second_num;i++)
		{
			// 해당 숫자가 소수인 경우에만 출력
			if(isPrime[i])
				bw.write(Integer.toString(i)+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
