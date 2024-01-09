package algorithm_2Week_1;

import java.util.Scanner;
import java.util.Stack;

public class BJ10828 {
	
	public static int[] stack;						// 스택을 담을 배열
	public static int size = 0;						// 스택에 들어있는 정수의 갯수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();						// 명령의 수
		String command;
		
		stack = new int[n];
		for(int i = 0; i < n; i++) {
			command = sc.next();
			switch (command) {
			case "push" :
				push(sc.nextInt());					// 스택에 scanner로 입력받은 값 추가
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
			case "top" :
				sb.append(top()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
	
	public static void push(int item) {
		stack[size] = item;
		size++;										// 스택에 추가될경우 스택의 갯수 1 증가
	}
	
	public static int pop() {
		return size > 0 ? stack[--size] : -1;		// size의 값이 0보다 크면 전위감소연산자를 적용한 size를 아니면 0을 반환
	}
	
	public static int size() {
		return size;
	}
	
	public static int empty() {
		return size == 0 ? 1 : 0;		
		
	}
	
	public static int top() {
		return size > 0 ? stack[size - 1] : -1;		// 인덱스는 0부터 시작하므로  size-1
	}
	
	
	
//	 방법 2
	
//	 public static Stack<Integer> stack = new Stack<>();
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();
//
//        int n = sc.nextInt(); // 명령의 수
//        String command;
//
//        for (int i = 0; i < n; i++) {
//            command = sc.next();
//            switch (command) {
//                case "push":
//                    push(sc.nextInt());
//                    break;
//                case "pop":
//                    sb.append(pop()).append("\n");
//                    break;
//                case "size":
//                    sb.append(size()).append("\n");
//                    break;
//                case "empty":
//                    sb.append(empty()).append("\n");
//                    break;
//                case "top":
//                    sb.append(top()).append("\n");
//                    break;
//            }
//        }
//        System.out.println(sb);
//    }
//
//    public static void push(int item) {
//        stack.push(item);
//    }
//
//    public static int pop() {
//        return stack.isEmpty() ? -1 : stack.pop();
//    }
//
//    public static int size() {
//        return stack.size();
//    }
//
//    public static int empty() {
//        return stack.isEmpty() ? 1 : 0;
//    }
//
//    public static int top() {
//        return stack.isEmpty() ? -1 : stack.peek();				
//    }
	
}
