
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class A10828 {
    public static void main(String[] args) throws IOException {

        // 14시 41분 시작
        // 15시 55분 종료 : 1시간  10분 : 70분 실패

        Stack<Integer> stack=new Stack<>();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int number=Integer.parseInt(br.readLine());

        for (int i=0;i<number;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String commend=st.nextToken();
            if (commend.equals("push")){
                int pushNumber=Integer.parseInt(st.nextToken());
                stack.push(pushNumber);
            } else if (commend.equals("top")) {
                if (stack.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            } else if (commend.equals("size")){
                System.out.println(stack.size());
            } else if (commend.equals("empty")) {
                if (stack.empty()){
                    System.out.println(1);
                } else if (!stack.empty()) {
                    System.out.println(0);
                }
            } else if (commend.equals("pop")) {
                if (stack.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            }
        }
    }
}
