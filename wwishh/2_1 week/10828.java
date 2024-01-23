package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj_10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt  = Integer.parseInt(br.readLine());
		
		Stack<Integer> stackInt = new Stack<Integer>();
		
		for(int i=0; i<cnt; i++) {
			String stack = br.readLine();
			if(stack.split(" ")[0].equals("push")) {
				stackInt.push(Integer.parseInt(stack.split(" ")[1]));
			}
			else if(stack.equals("pop")) {
				if(stackInt.empty())
					System.out.println("-1");
				else
					System.out.println(stackInt.pop());
			}
			else if(stack.equals("size"))
				System.out.println(stackInt.size());
			else if(stack.equals("empty")) {
				if(stackInt.empty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(stack.equals("top")) {
				if(stackInt.empty())
					System.out.println("-1");
				else
					System.out.println(stackInt.peek());
			}
				
		}
	}

}
