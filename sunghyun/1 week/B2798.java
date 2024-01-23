package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2798 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int arr[]=new int[N];
		int total[]=new int[1000000];
		int maxTotal=0;
		
		st=new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				for(int k=0;k<N;k++)
				{
					if(arr[i]!=arr[j] && arr[j]!=arr[k] && arr[k]!=arr[i])
					{
						if(arr[i]+arr[j]+arr[k]<=M)
						{
							total[k]=arr[i]+arr[j]+arr[k];
							if(maxTotal<total[k])
								maxTotal=total[k];
						}
					}
				}
			}
		}
		
		System.out.println(maxTotal);
		
	}

}
