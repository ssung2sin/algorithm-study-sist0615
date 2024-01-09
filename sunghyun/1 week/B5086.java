package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B5086 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0;i<10000;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			
			if(A==0 && B==0)
				break;
			else if(B/A>0 && B%A==0)
			{
				bw.write("factor");
				bw.newLine();
			}
			else if(A/B>0 && A%B==0)
			{
				bw.write("multiple");
				bw.newLine();
			}
			else
			{
				bw.write("neither");
				bw.newLine();
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 10분

}
