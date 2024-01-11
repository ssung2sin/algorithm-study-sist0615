package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class A10866 {

	static Deque<Integer> deque = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N;
		int size = 0;
		
		N = Integer.parseInt(br.readLine());
		
		String order;
		StringTokenizer st;
		
		int num;
		
		for(int i=0; i<N; i++)
		{
			st = new StringTokenizer(br.readLine());
			order = st.nextToken();
			
			switch (order) {
				
				case "push_front": 
					num = Integer.parseInt(st.nextToken());
					deque.offerFirst(num);
					size++;
					break;
					
				case "push_back": 
					num = Integer.parseInt(st.nextToken());
					deque.offerLast(num);
					size++;
					break;	
					
				case "pop_front": 
					
					if(size==0)
						System.out.println(-1);
					else
					if(size>0)
					{	
						System.out.println(deque.pollFirst());
						size--;
					}
					else 
						System.out.println(deque.pollFirst());
					break;
					
				case "pop_back": 
					
					if(size==0)
						System.out.println(-1);
					else
					if(size>0)
					{		
						System.out.println(deque.pollLast());
						size--;
					}
					else
						System.out.println(deque.pollLast());
					break;
				
				case "size":
					System.out.println(size);
					break;
					
				case "empty":
					if(deque.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
					
				case "front":
					if(size!=0)					//peek 제거하지 않은 채 리턴
						System.out.println(deque.peekFirst());
					else 
						System.out.println(-1);
					break;
					
				case "back":	
					if(size!=0)
						System.out.println(deque.peekLast());
					else
						System.out.println(-1);
					break;
			}
				
			}
			
		}
	

}
