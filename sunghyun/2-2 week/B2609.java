package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2609 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int first_num=Integer.parseInt(st.nextToken());
		int second_num=Integer.parseInt(st.nextToken());
		
		//문제 조건의 10000이하의 자연수 갯수 만큼배열 생성
		int first_arr[]=new int[10000];
		int second_arr[]=new int[10000];
		
		//최대공약수
		int maxNum=0;
		
		//각각 첫번째 수와 두번째 수의 약수 구해서 배열에 넣기
		for(int i=1;i<first_num+1;i++)
		{
			if(first_num%i==0)
			{
				first_arr[i-1]=i;
			}
		}
		
		for(int i=1;i<second_num+1;i++)
		{
			if(second_num%i==0)
			{
				second_arr[i-1]=i;
			}
		}
		
		
		//최대 배열 길이 만큼 반복 maxNum을 두 수의 최대공약수로 초기화(제일 끝에 같은 경우가 최대공약수)
		for(int i=0;i<10000;i++)
		{
			for(int j=0;j<10000;j++)
			{
				if(first_arr[i]==second_arr[j] && first_arr[i]!=0 && second_arr[i]!=0)
					maxNum=first_arr[i];
			}
		}
		
		System.out.println(maxNum);
		
		//최소공배수는 최소공배수 * 최소공배수로 두 수를 나눈 몫 
		int first_leastNum=first_num/maxNum;
		int second_leastNum=second_num/maxNum;
		
		if(first_leastNum!=0 && second_leastNum!=0)
			System.out.println(maxNum*first_leastNum*second_leastNum);
		
		
		
		
	}

}
