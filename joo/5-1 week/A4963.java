package baekjoon.week5_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A4963 {

	public static void main(String[] args) throws IOException {
		// 섬의 개수 출력하는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int width=0;
		int height=0;
		
		while(width != 0 && height != 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			width = Integer.parseInt(st.nextToken());
			height = Integer.parseInt(st.nextToken());
			
			for(int i=0;i<width;i++) {
				for(int j=0;j<height;j++) {
					
					int division = Integer.parseInt(st.nextToken());
					
					if(division==1) {
						
					}
				}
			}
			
	
			
		}	

	}

}
