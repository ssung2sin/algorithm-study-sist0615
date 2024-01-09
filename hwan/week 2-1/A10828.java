package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A10828 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int orderNum=Integer.parseInt(br.readLine());

		int size=0;

		String [] stack=new String[orderNum];

		for(int i=0; i<orderNum; i++) {

			StringTokenizer st=new StringTokenizer(br.readLine());

			String command=st.nextToken();

			if(command.equals("push")) {
				stack[size] = st.nextToken();
				size++;

			} else if(command.equals("pop")) {

				if(size==0) {
					bw.write(-1+"\n");

					//size가 1이면 0이되서 -1출력 , 2면 1이되서 stack[1]출력
				}else {

					size--;
					bw.write(stack[size]+"\n");
				}
			} else if(command.equals("size")) {
				bw.write(size+"\n");
			} else if(command.equals("empty")) {

				if(size==0) {
					bw.write(1+"\n");
				}else {
					bw.write(0+"\n");
				}
			} else if(command.equals("top")) {

				if(size==0) {
					bw.write(-1+"\n");
				}else {
					//size는 배열의길이임,인덱스는 0부터,size-1해야 최고번지가 나옴 ex)size=3이면 stack[] 0,1,2 번지 존재 따라서 stack[3-1]를 해줘야 stack[2]
					bw.write(stack[size-1]+"\n");
				}

			}
		}
		br.close();
		bw.flush();
		bw.close();


	}

}
