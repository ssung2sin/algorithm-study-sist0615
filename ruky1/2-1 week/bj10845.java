package bj;

import java.util.Scanner;

public class bj10845 {
	static int[] que = new int[10001];
	static int first = 0;
	static int last = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int commandCount = sc.nextInt();
		
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
			}else if(str.equals("front")){
				sb.append(front()).append('\n');
			}else if(str.equals("back")){
				sb.append(back()).append('\n');
			}

		}
		System.out.println(sb);
		sc.close();
	}
	
	public static void push(int X) {
		que[last] = X;
		last++;
	}
	
	public static int pop() {
		if(last - first == 0) {
			return -1;
		}else {
			int P = que[first];
			first++;
			return P;
		}
	}
	
	public static int size() {
		return last - first;
	}
	
	public static int empty() {
		if(last - first == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static int front() {
		if(last - first == 0) {
			return -1;
		}else {
			int F = que[first];
			return F;
		}
	}
	
	public static int back() {
		if(last - first == 0) {
			return -1;
		}else {
			int B = que[last - 1];
			return B;
		}
	}

}
