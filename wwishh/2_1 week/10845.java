package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Bj_10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> queueInt = new LinkedList<Integer>();
		
		int cnt = Integer.parseInt(br.readLine());
		
		String back = "";
		
		for(int i=0; i<cnt; i++) {
			String queue = br.readLine();
			
			if(queue.split(" ")[0].equals("push")) {
				queueInt.add(Integer.parseInt(queue.split(" ")[1]));
				back = queue.split(" ")[1];
			}
			else if(queue.equals("pop")) {
				if(queueInt.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queueInt.poll());		
			}
			else if(queue.equals("size"))
				System.out.println(queueInt.size());
			else if(queue.equals("empty")) {
				if(queueInt.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(queue.equals("front")) {
				if(queueInt.peek()!=null)
					System.out.println(queueInt.peek());
				else
					System.out.println(-1);
			}
			else if(queue.equals("back")) {
				if(queueInt.isEmpty())
					System.out.println(-1);
				else
					System.out.println(back);
			}
				
				
		}
	}

}
