package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A10845 {

	static Queue<Integer> queue = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//LinkedList는 이중 연결 리스트로 구현되어 있어 요소를 추가하거나 제거할 때 효율적

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = 0;
		int N;
		int inputnum = 0;

		N = Integer.parseInt(br.readLine());

		String order;
		StringTokenizer st;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			order = st.nextToken();

			switch (order) {
				case "push":

					inputnum = Integer.parseInt(st.nextToken());
					push(inputnum);

					size++;
					break;

				case "pop":
					if (queue.isEmpty())
						System.out.println(-1);
					else if (size != 0) {
						System.out.println(queue.poll());
						size--;
					} else
						System.out.println(queue.poll());
					break;

				case "size":
					System.out.println(size);
					break;

				case "empty":
					if (size == 0)
						System.out.println(1);
					else
						System.out.println(0);
					break;

				case "front":
					if (size == 0)
						System.out.println(-1);
					else
						System.out.println(queue.peek());
					break;

				case "back":
					if (size == 0)
						System.out.println(-1);
					else
						System.out.println(inputnum);
					break;

			}
		}
	}

	private static void push(int num) {
		// TODO Auto-generated method stub
		queue.offer(num); //queue에서 데이터를 추가할 때 add() 또는 offer() 사용
	}

}
