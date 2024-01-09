package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class A10828 {

	static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int size = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N;
		N = Integer.parseInt(br.readLine());

		String order;
		StringTokenizer st;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			order = st.nextToken();

			switch (order) {
				case "push":
					push(Integer.parseInt(st.nextToken()));
					size++;
					break;

				case "pop": //stack의 마지막 요소(가장 위 요소) 제거, 동시에 해당 값 반환
					if (stack.empty())
						System.out.println(-1);
					else if (size > 0) {
						size--;
						System.out.println(stack.pop());
					} else
						System.out.println(stack.pop());
					break;

				case "size":
					System.out.println(size);
					break;

				case "empty":
					if (stack.empty())
						System.out.println(1);
					else
						System.out.println(0);
					break;

				case "top":
					if (size > 0)
						System.out.println(stack.peek()); //peek: stack의 top에 있는 값을 삭제하지 않고 해당 값을 반환  
					else
						System.out.println(-1);
					break;
			}
		}
		br.close();
	}

	private static void push(int num) {
		// TODO Auto-generated method stub
		stack.push(num);
	}

}
