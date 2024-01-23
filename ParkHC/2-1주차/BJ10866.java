package algorithm_2Week_1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BJ10866 {

	public static Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt(); 								// 명령의 수
        String command;

        for (int i = 0; i < n; i++) {
            command = sc.next();
            switch (command) {
                case "push_front":
                    push_front(sc.nextInt());
                    break;
                case "push_back":
                    push_back(sc.nextInt());
                    break;
                case "pop_front":
                    sb.append(pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(pop_back()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push_front(int item) {
        deque.addFirst(item);
    }

    public static void push_back(int item) {
        deque.addLast(item);
    }

    public static int pop_front() {
        Integer result = deque.pollFirst();					// null값을 처리하기 위해 Integer를 사용
        return result != null ? result : -1;
    }

    public static int pop_back() {
        Integer result = deque.pollLast();
        return result != null ? result : -1;
    }

    public static int size() {
        return deque.size();
    }

    public static int empty() {
        return deque.isEmpty() ? 1 : 0;
    }

    public static int front() {
        return deque.isEmpty() ? -1 : deque.peek();
    }

    public static int back() {
        return deque.isEmpty() ? -1 : deque.peekLast();
    }
}
