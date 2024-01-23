package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int commandCnt=Integer.parseInt(br.readLine().trim());
		Deque<Integer> deq=new LinkedList<Integer>();
		
		for(int i=0;i<commandCnt;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine().trim());
			
			String command=st.nextToken();
			
			if(command.equals("push_front"))
			{
				int su=Integer.parseInt(st.nextToken());
				
				deq.addFirst(su);
			}
			else if(command.equals("push_back"))
			{
				int su=Integer.parseInt(st.nextToken());
				
				deq.addLast(su);
			}
			else if(command.equals("pop_front"))
			{
				if(deq.isEmpty())
					bw.write("-1"+"\n");
				else
					bw.write(Integer.toString(deq.pollFirst())+"\n");
			}
			else if(command.equals("pop_back"))
			{
				if(deq.isEmpty())
					bw.write("-1"+"\n");
				else
					bw.write(Integer.toString(deq.pollLast())+"\n");
			}
			else if(command.equals("size"))
			{
				bw.write(Integer.toString(deq.size())+"\n");
			}
			else if(command.equals("empty"))
			{
				if(deq.isEmpty())
					bw.write("1"+"\n");
				else
					bw.write("0"+"\n");
			}
			else if(command.equals("front"))
			{
				if(deq.isEmpty())
					bw.write("-1"+"\n");
				else
					bw.write(deq.peekFirst()+"\n");
			}
			else if(command.equals("back"))
			{
				if(deq.isEmpty())
					bw.write("-1"+"\n");
				else
					bw.write(deq.peekLast()+"\n");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
