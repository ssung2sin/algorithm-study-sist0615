package baekjoon.week2_1;

import java.util.Scanner;

public class A10845 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 숫자로 배열 크기를 설정
        int commandN = scanner.nextInt();
        int front = 0; // 큐의 맨 앞을 가리키는 인덱스
        int rear = -1; // 큐의 맨 뒤를 가리키는 인덱스
        int[] pushArr = new int[commandN]; // 배열 크기를 commandN으로 설정
        StringBuilder sb = new StringBuilder();

        // 명령 처리
        for (int i = 0; i < commandN; i++) {
            String command = scanner.next();

            switch (command) {
                case "push":
                    int num = scanner.nextInt();
                    pushArr[++rear] = num; // 큐의 뒷쪽에 데이터 추가
                    break;

                case "pop":
                    if (front <= rear) {
                        sb.append(pushArr[front++]);
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;

                case "front":
                    if (front <= rear) {
                        sb.append(pushArr[front]);
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;

                case "back":
                    if (front <= rear) {
                        sb.append(pushArr[rear]);
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;

                case "size":
                    sb.append(rear - front + 1);
                    sb.append("\n");
                    break;

                case "empty":
                    sb.append(front > rear ? 1 : 0);
                    sb.append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
