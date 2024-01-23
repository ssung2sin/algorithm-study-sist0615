package bj;

import java.util.Scanner;

public class bj10828 {
	
	public static int[] stack;
	public static int size = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int commandCount = sc.nextInt();
 
		stack = new int[commandCount];
		
		for(int i = 0; i < commandCount; i++) {
        
			String str = sc.next();
 
			if(str.equals("push")) {
				push(sc.nextInt());
			}else if(str.equals("pop")){
				sb.append(pop()).append('\n');
			}else if(str.equals("size")){
				sb.append(size()).append('\n');
			}else if(str.equals("empty")){
				sb.append(empty()).append('\n');
			}else if(str.equals("top")){
				sb.append(top()).append('\n');
			}

		}
		System.out.println(sb);
		sc.close();
	}
	public static void push(int item) {
		stack[size] = item;
		size++;
	}
    
	public static int pop() {
		if(size == 0) {
			return -1;
		}
		else {
			int res = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return res;
		}
	}
    
	public static int size() {
		return size;
	}
    
	public static int empty() {
		if(size == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
    
	public static int top() {
		if(size == 0) {
			return -1;
		}
		else {
			return stack[size - 1];
		}
	}
}
