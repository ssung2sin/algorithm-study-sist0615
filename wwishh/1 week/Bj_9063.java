package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_9063 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int maxX = -10000;
		int maxY = -10000;
		int minX = 10000;
		int minY = 10000;
		
		for(int i=0; i<n; i++) {
			 String[] input = br.readLine().split(" ");
	         int x = Integer.parseInt(input[0]);
	         int y = Integer.parseInt(input[1]);
	         
	         maxX = Math.max(maxX, x);
	         minX = Math.min(minX, x);
	         maxY = Math.max(maxY, y);
	         minY = Math.min(minY, y);
		}
		
		int area = (maxX - minX) * (maxY - minY);

		System.out.println(area);
	}

}
