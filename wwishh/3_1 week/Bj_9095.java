package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_9095 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] arr = new int[11];
		
		//1, 2, 3일 때 경우의 수
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		//경우의 수 구하는 공식
		for(int i=4; i<=10; i++) {
			arr[i] = arr[i-3] + arr[i-2] + arr[i-1]; 
		}
		
		for(int i=0; i<t; i++) {
			int num = Integer.parseInt(br.readLine());
			
			bw.write(arr[num]+ "\n");
		}
		bw.close();
	}

}
