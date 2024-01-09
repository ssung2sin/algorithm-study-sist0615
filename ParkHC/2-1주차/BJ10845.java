package algorithm_2Week_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ10845 {

//	public static int[] que;						// 큐를 담을 배열
//	que = new int[n];
	
	public static int first = 0;					// 큐에 들어있는 정수중 맨 앞
	public static int size = 0;						// 큐에 들어있는 정수의 갯수
	public static Queue<Integer> que = new LinkedList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();						// 명령의 수
		String command;
		
		for(int i = 0; i < n; i++) {
			command = sc.next();
			switch (command) {
			case "push" :
				push(sc.nextInt());					// 큐에 scanner로 입력받은 값 추가
				break;
			case "pop" :
				sb.append(pop()).append("\n");
				break;
			case "size" :
				sb.append(size()).append("\n");
				break;
			case "empty" :
				sb.append(empty()).append("\n");
				break;
			case "front" :
				sb.append(front()).append("\n");
				break;
			case "back" :
				sb.append(back()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
	
//	방법 1)
	
//	public static void push(int item) {
//		que[size] = item;
//		size++;										
//	}
//	
//	public static int pop() {
//		return size - first > 0 ? que[first++] : -1;		
//	}
//	
//	public static int size() {
//		return size - first;
//	}
//	
//	public static int empty() {
//		return size - first == 0 ? 1 : 0;		
//	}
//	
//	public static int front() {
//		return size - first > 0 ? que[first] : -1;		
//	}
//	
//	public static int back() {
//		return size - first > 0 ? que[size - 1] : -1;		
//	}
	
	
// 	방법 2)
	
    public static void push(int item) {
        que.add(item);
    }

    public static int pop() {
        return que.isEmpty() ? -1 : que.poll();
    }

    public static int size() {
        return que.size();
    }

    public static int empty() {
        return que.isEmpty() ? 1 : 0;
    }

    public static int front() {
        return que.isEmpty() ? -1 : que.peek();
    }

    public static int back() {
        return que.isEmpty() ? -1 : ((LinkedList<Integer>) que).getLast();
    }
}
