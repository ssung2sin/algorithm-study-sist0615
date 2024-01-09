package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class B10828 {

	public static void main(String[] args) throws NumberFormatException,IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int commandCnt=Integer.parseInt(br.readLine().trim());
		Stack<Integer> stack=new Stack<Integer>();
		
		for(int i=0;i<commandCnt;i++)
		{	
			StringTokenizer st=new StringTokenizer(br.readLine().trim());
			
			String command=st.nextToken();
			
			if(command.equals("push"))
			{
				int su=Integer.parseInt(st.nextToken());
				
				stack.push(su);
			}
			else if(command.equals("top"))
			{
				if(stack.size()!=0)
					bw.write(Integer.toString(stack.peek())+ "\n");
				else
					bw.write("-1"+ "\n");
			}
			else if(command.equals("size"))
				bw.write(Integer.toString(stack.size())+ "\n");
			else if(command.equals("empty"))
			{
				if(stack.isEmpty())
					bw.write("1"+ "\n");
				else
					bw.write("0"+ "\n");
			}
			else if(command.equals("pop"))
			{
				if(stack.isEmpty())
					bw.write("-1"+ "\n");
				else
					bw.write(Integer.toString(stack.pop())+ "\n");
			}

			bw.flush();
		}

		bw.close();
		br.close();
	}

}
