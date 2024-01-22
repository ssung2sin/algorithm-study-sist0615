package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14501 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int cnt=Integer.parseInt(br.readLine());
		
		int date[]=new int[cnt+1];
		int pay[]=new int[cnt+1];
		
		for(int i=0;i<cnt;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine().trim());
			
			date[i]=Integer.parseInt(st.nextToken());
			pay[i]=Integer.parseInt(st.nextToken());
		}
		
		int totalpay[]=new int[cnt+1];
		
		for(int i=0;i<cnt;i++)
		{
			if(i+date[i] <= cnt) {
				totalpay[i+date[i]] = Math.max(totalpay[i+date[i]], totalpay[i]+pay[i]);							
			}
			totalpay[i+1] = Math.max(totalpay[i+1], totalpay[i]);
		}
		
		System.out.println(totalpay[cnt]);
	}

}
