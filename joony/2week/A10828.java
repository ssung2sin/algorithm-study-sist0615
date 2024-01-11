package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class A10828 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//stack은 후입선출
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		
		ArrayList<Integer> stack = new ArrayList<>();
		
		StringBuilder sb = new StringBuilder();
		
		//input개수만큼 명령어를 돌려줌		
		for(int i=0; i<input; i++) {
			String[] command = sc.nextLine().split(" ");
			//System.out.println(Arrays.toString(command));
			
			switch(command[0]) {
				case "push":
					int value = Integer.parseInt(command[1]);
					stack.add(value);
					break;
				
				case "pop":
					if(!stack.isEmpty()) {
						sb.append(stack.get(stack.size()-1)).append("\n");
						stack.remove(stack.size()-1);
					}else {
						sb.append("-1").append("\n");
					}
					break;
					
				case "top":
					if(!stack.isEmpty()) {
						sb.append(stack.get(stack.size()-1)).append("\n");
					}else {
						sb.append("-1").append("\n");
					}
					break;
					
				case "size":
					sb.append(stack.size()).append("\n");
					break;
				
				case "empty":
					sb.append(stack.isEmpty()?1:0).append("\n");
					break;
				
			}
			
		}

		System.out.println(sb.toString());
		
		
	}
}
