package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2745 {
	
	public static void main(String[] args) throws NumberFormatException,IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		String N=st.nextToken();
		int B=Integer.parseInt(st.nextToken());
		int total=0;
		int al[]=new int[10000];
		
		//N의 알파벳 1의자릿수 뽑기
		for(int i=0;i<N.length();i++)
		{
			char alpha[]=new char[10000];
			alpha[i]=N.charAt(N.length()-(i+1));
		
			if((int)alpha[i]>=48 && (int)alpha[i]<=57)
			{
				al[i]=(int)alpha[i]-48;
			}
			else
			{
				al[i]=(int)alpha[i]-55;
			}
		}
		
		
		for(int i=0;i<N.length();i++)
		{	
			//1의 자리수일때
			if(i==0)
			{
				if(al[0]!=0)
					total=al[0]*1;
				else
					total=0;
			}
			//10의 자리수 이상일때
			else
			{
				if(al[i]!=0)
					total+=al[i]*(Math.pow(B, i));
				else
					total+=0;
			}
		}
		
		System.out.println(total);
		
	}
}
