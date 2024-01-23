package baekjoon;

import java.util.Scanner;

public class B9095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// https://lotuslee.tistory.com/43 풀이방식 참고
		
		Scanner sc=new Scanner(System.in);
		
		int testCnt=sc.nextInt();
		
		int sumArr[]=new int[11];
		
		sumArr[0]=0;
		sumArr[1]=1;
		sumArr[2]=2;
		sumArr[3]=4;
		
		for(int i=0;i<testCnt;i++)
		{
			int su=sc.nextInt();
			
			for(int j=4;j<=su;j++)
			{
				sumArr[j]=sumArr[j-1]+sumArr[j-2]+sumArr[j-3];
			}
			
			System.out.println(sumArr[su]);
		}
		
	}

}
