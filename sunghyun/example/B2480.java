package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2480 {

	public static void main(String[] args) throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr [] = new int[3];
		
		for(int i=0;i<3;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		if(arr[0]==arr[1] && arr[1]==arr[2])
		{
			System.out.println(10000+(arr[0]*1000));
		}
		
		if(arr[0]==arr[1] && arr[1]!=arr[2] && arr[0]!=arr[2])
		{
			System.out.println(1000+(arr[0]*100));
		}
		else if(arr[0]!=arr[1] && arr[0]!=arr[2] && arr[1]==arr[2])
		{
			System.out.println(1000+(arr[1]*100));
		}
		else if(arr[0]==arr[2] && arr[0]!=arr[1] && arr[1]!=arr[2])
		{
			System.out.println(1000+(arr[0]*100));
		}
		
		///////////////////////////////////////////////////////////성신 도움
		
		if(arr[0]!=arr[1] && arr[1]!=arr[2] && arr[2]!=arr[0])
		{
			
			int max=0;
			for(int i=0;i<3;i++)
			{
				if(max<arr[i])
					max=arr[i];
			}
			System.out.println(max*100);
			
		}
	}

}
