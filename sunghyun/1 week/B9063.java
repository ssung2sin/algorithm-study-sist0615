package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.naming.ldap.SortControl;

public class B9063 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int w=0;
		int x[]=new int[N];
		int y[]=new int[N];
		int maxX=0;
		int minX=0;
		int maxY=0;
		int minY=0;
		
		for(int i=0;i<N;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			x[i]=Integer.parseInt(st.nextToken());
			y[i]=Integer.parseInt(st.nextToken());
		}
		
		if(x.length<=1 && y.length<=1)
			System.out.println(0);
		else
		{
			Arrays.sort(x);
			Arrays.sort(y);
		
			w=(x[N-1]-x[0])*(y[N-1]-y[0]);
			System.out.println(w);
		}
	}

}
