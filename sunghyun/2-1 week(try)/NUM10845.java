package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int commandCnt=Integer.parseInt(br.readLine().trim());
		Queue<Integer> que=new LinkedList<Integer>();
		int last=0;
		
		for(int i=0;i<commandCnt;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine().trim());
			
			String command=st.nextToken();
			
			if(command.equals("push"))
			{
				int su=Integer.parseInt(st.nextToken());
				
				que.add(su);
				
				last=su;
			}
			else if(command.equals("pop"))
			{
				if(que.size()!=0)
					bw.write(Integer.toString(que.poll())+ "\n");
				else
					bw.write("-1"+ "\n");
			}
			else if(command.equals("size"))
			{
				bw.write(Integer.toString(que.size())+ "\n");
			}
			else if(command.equals("empty"))
			{
				if(que.isEmpty())
					bw.write("1"+ "\n");
				else
					bw.write("0"+ "\n");
			}
			else if(command.equals("front"))
			{
				if(!(que.isEmpty()))
					bw.write(Integer.toString(que.peek())+ "\n");
				else
					bw.write("-1"+ "\n");
			}
			else if(command.equals("back"))
			{
				if(que.isEmpty())
					bw.write("-1"+ "\n");
				else
					bw.write(Integer.toString(last)+ "\n");
			}
			
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
