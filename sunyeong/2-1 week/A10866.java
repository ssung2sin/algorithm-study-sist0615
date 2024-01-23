package baekjoon_CodingStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class A10866 {

	//덱
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sbf=new StringBuffer();
		Deque<Integer> deque=new ArrayDeque<Integer>(); //Deque 인터페이스
		
		int input_N;
		
		try {
			input_N = Integer.parseInt(bf.readLine());
			for(int i=0;i<input_N;i++) {
				StringTokenizer st=new StringTokenizer(bf.readLine());
				String input_type=st.nextToken();
				
				if(input_type.equals("push_front")) {
					int X=Integer.parseInt(st.nextToken());
					deque.addFirst(X);
				}
				if(input_type.equals("push_back")) {
					int X=Integer.parseInt(st.nextToken());
					deque.addLast(X);
				}
				if(input_type.equals("pop_front")) {
					
					if(deque.isEmpty()) {
						sbf.append(-1).append("\n");
					}else {
						sbf.append(deque.pollFirst()).append("\n");
					}
					
				}
				if(input_type.equals("pop_back")) {
					
					if(deque.isEmpty()) {
						sbf.append(-1).append("\n");
					}else {
						sbf.append(deque.pollLast()).append("\n");
					}
					
				}
				if(input_type.equals("size")) {
					sbf.append(deque.size()).append("\n");
				}
				if(input_type.equals("empty")) {
					if(deque.isEmpty()) {
						sbf.append(1).append("\n");
					}else {
						sbf.append(0).append("\n");
					}
				}
				if(input_type.equals("front")) {
					if(deque.peekFirst()==null) {
						sbf.append(-1).append("\n");
					}else {
						sbf.append(deque.peekFirst()).append("\n");
					}
					
				}
				if(input_type.equals("back")) {
					if(deque.peekLast()==null) {
						sbf.append(-1).append("\n");
					}else {
						sbf.append(deque.peekLast()).append("\n");
					}
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sbf);
	}

}
