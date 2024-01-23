package bj;

import java.util.Scanner;

public class bj10866 {
	static int front = 10000;
	static int back = 10000;
	static int size = 0;
	static int[] deque = new int[20001];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int commandCount = sc.nextInt();
		
		for(int i = 0; i < commandCount; i++) {
	        
			String str = sc.next();
 
			if(str.equals("push_front")) {
				push_front(sc.nextInt());
			}else if(str.equals("push_back")){
				push_back(sc.nextInt());
			}else if(str.equals("pop_front")){
				sb.append(pop_front()).append('\n');
			}else if(str.equals("pop_back")){
				sb.append(pop_back()).append('\n');
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
	
	public static void push_front(int X) {
		deque[front] = X;
		front--;
		size++;
	}
	
	public static void push_back(int X) {
		back++;
		size++;
		deque[back] = X;
	}
	
	public static int pop_front() {
		if (size == 0) {
			return -1;
		} 
		int ret = deque[front + 1];
		front++;
		size--;	
		return ret;
	}
	
	public static int pop_back() {
		if (size == 0) {
			return -1;
		} 
		int ret = deque[back];
		back--;
		size--;	
		return ret;
	}
	
	public static int size() {
		return size;
	}
	
	public static int empty() {
		if(size == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static int front() {
		if(size == 0) {
			return -1;
		}else {
			int d_f = deque[front + 1];
			return d_f;
		}
	}
	
	public static int back() {
		if(size == 0) {
			return -1;
		}else {
			int d_b = deque[back];
			return d_b;
		}
	}

}
