package baekjoon.week2_1;

import java.util.Scanner;

public class A10828 {
    public static void main(String[] args) {
        
    	//스택문제 : 후입선출
    	
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 숫자로 배열 크기를 설정
        int commandN = scanner.nextInt();
        int top = -1; //스택의 값이 없다고 가정 (-1)
        int [] pushArr = new int[commandN]; // 배열 크기를 commandN으로 설정
        StringBuilder sb = new StringBuilder();

        // 명령 처리
        for (int i = 0; i < commandN; i++) {
            String command = scanner.next();

            //switch(변수 또는 표현식)
            switch (command) {
                case "push":
                    int num = scanner.nextInt();
                    pushArr[++top] = num ; // top 증가 후 값 저장               
                    break;

                case "pop":
                    if (top >= 0) {
                        sb.append(pushArr[top--]);
                        sb.append("\n");
                    } else {
                    	sb.append(-1);
                    	sb.append("\n");
                    }
                    break;

                case "top":
                    if (top >= 0) {
                    	sb.append(pushArr[top]);
                    	sb.append("\n");
                    } else {
                    	sb.append(-1);
                    	sb.append("\n");
                    }
                    break;

                case "size":
                	sb.append(top + 1);
                	sb.append("\n");
                    break;

                case "empty":
                	sb.append(top < 0 ? 1 : 0);
                	sb.append("\n");
                    break;
            }
        }
        
        System.out.println(sb);
    }
}
