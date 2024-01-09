package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A10845 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int orderNum=Integer.parseInt(br.readLine());

		int [] queue=new int[orderNum];

		int size=0; //배열길이

		for(int i=0; i<orderNum; i++) {

			StringTokenizer st=new StringTokenizer(br.readLine());

			String command=st.nextToken(); //명령어

			if(command.equals("push")) {
				int pushNum=Integer.parseInt(st.nextToken());
				queue[size]=pushNum;
				size++;

			}else if(command.equals("pop")) {

				if(size==0) {
					bw.write("-1\n");
				}else {
					bw.write(queue[0]+"\n");

					//size는 배열의길이, 0부터시작하니 size-1만큼 돌려야합니다.
					//size-1만큼 돌려야하는 이유는 size--를 하면 size가 하나가 줄기때문에 size-1만큼 돌려야하는것입니다.
					for(int j=0; j<size-1; j++) {

						//ex) q[0]=q[1] q[0]번지값 사라짐
						queue[j]=queue[j+1];
					}
					size--;

				}
			}else if(command.equals("size")) {

				bw.write(size+"\n");
			}else if(command.equals("empty")) {

				if(size==0) {
					bw.write("1\n");
				}else {
					bw.write("0\n");
				}
			}else if(command.equals("front")) {

				if(size==0) {
					bw.write("-1\n");
				}else {
					//가장앞에있는놈
					bw.write(queue[0]+"\n");
				}
			}else if(command.equals("back")) {
				if(size==0) {
					bw.write("-1\n");
				}else {
					bw.write(queue[size-1]+"\n");
				}
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
