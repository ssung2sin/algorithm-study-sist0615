package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2798 {
 //오답
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st=new StringTokenizer(bf.readLine());
			
			int N=Integer.parseInt(st.nextToken()); //N장의 카드
			int M=Integer.parseInt(st.nextToken()); //딜러가 외친 숫자 M
			
			int [] arr_N=new int[N]; //N장의 카드에 쓰여진 수를 담을 배열
			st=new StringTokenizer(bf.readLine());
			for(int i=0;i<N;i++) {
				arr_N[i]=Integer.parseInt(st.nextToken());
			}
			
			for(int num:arr_N) {
				System.out.println(num);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
