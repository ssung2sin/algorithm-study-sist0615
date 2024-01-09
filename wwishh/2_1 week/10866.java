package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Bj_10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		Deque<Integer> dequeInt = new ArrayDeque<Integer>();
		
		for(int i=0; i<cnt; i++) {
			String deque = br.readLine();
			
			if(deque.split(" ")[0].equals("push_front"))
				dequeInt.addFirst(Integer.parseInt(deque.split(" ")[1]));
			else if(deque.split(" ")[0].equals("push_back"))
				dequeInt.addLast(Integer.parseInt(deque.split(" ")[1]));
			else if(deque.equals("pop_front")) {
				if(dequeInt.isEmpty())
					System.out.println(-1);
				else
					System.out.println(dequeInt.pollFirst());	
			}
			else if(deque.equals("pop_back")) {
				if(dequeInt.isEmpty())
					System.out.println(-1);
				else
					System.out.println(dequeInt.pollLast());	
			}
			else if(deque.equals("size")) {
				System.out.println(dequeInt.size()); 
			}
			else if(deque.equals("empty")) {
				if(dequeInt.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(deque.equals("front")) {
				if(dequeInt.isEmpty())
					System.out.println(-1);
				else
					System.out.println(dequeInt.peekFirst());	
			}
			else if(deque.equals("back")) {
				if(dequeInt.isEmpty())
					System.out.println(-1);
				else
					System.out.println(dequeInt.peekLast());	
			}
					
		}
	}

}
