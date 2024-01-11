package Week2;

import java.util.ArrayList;
import java.util.Scanner;

public class A10866 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> deque = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input; i++) {
            String[] command = sc.nextLine().split(" ");

            switch (command[0]) {
                case "push_front":
                    int valueFront = Integer.parseInt(command[1]);
                    deque.add(0, valueFront);
                    break;

                case "push_back":
                    int valueBack = Integer.parseInt(command[1]);
                    deque.add(valueBack);
                    break;

                case "pop_front":
                    if (!deque.isEmpty()) {
                        sb.append(deque.remove(0)).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;

                case "pop_back":
                    if (!deque.isEmpty()) {
                        sb.append(deque.remove(deque.size() - 1)).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;

                case "size":
                    sb.append(deque.size()).append("\n");
                    break;

                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;

                case "front":
                    if (!deque.isEmpty()) {
                        sb.append(deque.get(0)).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;

                case "back":
                    if (!deque.isEmpty()) {
                        sb.append(deque.get(deque.size() - 1)).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
            }
        }

        System.out.println(sb.toString());
    }
}
