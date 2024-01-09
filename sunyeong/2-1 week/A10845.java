package baekjoon_CodingStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class A10845 {
	
	//큐
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		//Queue는 인터페이스
		//Queue를 구현할 수 있는 클래스는 LinkedList / ArrayDeque / PriorityQueue(우선순위 큐 확인 시)
		Queue<Integer> q=new ArrayDeque<Integer>();
		
		int order_N=Integer.parseInt(bf.readLine());
		
		for(int i=0;i<order_N;i++) {
			StringTokenizer st=new StringTokenizer(bf.readLine());
			String input_type=st.nextToken();
			
			if(input_type.equals("push")) {
				int X=Integer.parseInt(st.nextToken());
				q.add(X);
				
			}
			if(input_type.equals("pop")) {
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(q.poll()).append("\n");
				}
			}
			if(input_type.equals("size")) {
				sb.append(q.size()).append("\n");
				
			}
			if(input_type.equals("empty")) {
				 sb.append(q.isEmpty()?1:0).append("\n");
			}
			if(input_type.equals("front")) {
				sb.append(q.isEmpty()?-1:q.peek()).append("\n");
			}
			if(input_type.equals("back")) {
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					//큐의 가장 뒤에 있는 정수를 출력한다.
					ArrayDeque<Integer> reverse_q=(ArrayDeque<Integer>)q;
					sb.append(reverse_q.peekLast()).append("\n");
				}
			}
		}
		
		System.out.println(sb);
		
	}
}
