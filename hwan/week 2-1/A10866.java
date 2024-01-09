package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A10866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int orderNum = Integer.parseInt(br.readLine());

		int[] deque = new int[orderNum];

		int size = 0;

		for (int i = 0; i < orderNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if (command.equals("push_front")) {
				int pushNum = Integer.parseInt(st.nextToken());
				if (size == 0) {
					deque[size] = pushNum;
				} else {
					for (int j = size; j > 0; j--) {
						deque[j] = deque[j - 1];
					}
					deque[0] = pushNum;
				}
				size++;
			} else if (command.equals("push_back")) {
				int pushNum = Integer.parseInt(st.nextToken());
				deque[size] = pushNum;
				size++;
			} else if(command.equals("pop_front")) {
				if(size==0) {
					bw.write("-1\n");
				}else {
					bw.write(deque[0]+"\n");
					for(int j=0; j<size-1; j++) {
						deque[j]=deque[j+1];
					}
					size--;
				}
			}  else if(command.equals("pop_back")) {

				if(size==0) {
					bw.write("-1\n");
				}else {
					bw.write(deque[size-1]+"\n");
					size--;
				}
			} else if(command.equals("size")) {

				bw.write(size+"\n");
			} else if(command.equals("empty")) {

				if(size==0) {
					bw.write("1\n");
				}else {
					bw.write("0\n");
				}
			}else if(command.equals("front")) {

				if(size==0) {
					bw.write("-1\n");
				}else {
					bw.write(deque[0]+"\n");
				}
			}else if(command.equals("back")) {
				if(size==0) {
					bw.write("-1\n");
				}else {
					bw.write(deque[size-1]+"\n");
				}
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
