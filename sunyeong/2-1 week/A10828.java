package baekjoon_CodingStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class A10828 {
	
	//스택 문제
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer buf=new StringBuffer(); // 출력되는 문자들을 가변적으로 변형해주기 위해 StringBuilder를 사용해도 좋다!
		
		Stack<Integer> stack=new Stack<Integer>();
		
		//주어지는 명령의 수 
		int order=Integer.parseInt(bf.readLine());
		
		for(int i=0; i<order; i++) {
			StringTokenizer st=new StringTokenizer(bf.readLine());
			String input_data=st.nextToken();

			if(input_data.equals("push")) {
				int X=Integer.parseInt(st.nextToken());
				stack.push(X);
				
			}
			if(input_data.equals("top")) {
				
				buf.append(stack.isEmpty()?-1:stack.peek()).append("\n");
				//System.out.println(stack.size()>0?stack.lastElement():-1); 
			}
			
			if(input_data.equals("size")) {
				
				buf.append(stack.size()).append("\n");
				//System.out.println(stack.size());
			}
			
			if(input_data.equals("empty")) {
				
				buf.append(stack.isEmpty()?1:0).append("\n");
				//System.out.println(stack.isEmpty()?1:0);
			}
			if(input_data.equals("pop")) {
				
				if(stack.isEmpty()) { //스택이 비어있는 상황인지를 조건을 통해 우선적으로 확인해야 오류가 안난다
					buf.append(-1+"\n");
					//System.out.println(-1);
				}else {
					
					//결과값이 맞음에도 불구하고 자꾸 에러가 떠서 화가났는데, 오류는 peek()대신 lastElement를 사용했던 점이다.
					// peek()은 마지막 값을 단순 확인하기 위해 보여주기만 하지만, lastElement는 마지막 값을 보여주고 제거한다고 한다..
					buf.append(stack.peek()+"\n");
					//System.out.println(stack.peek());
					stack.pop();
				}
				
				
			}
		}
		System.out.println(buf);
		
		
	}

}
