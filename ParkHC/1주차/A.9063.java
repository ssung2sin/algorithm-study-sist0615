package algorithm_1Week;

import java.util.Scanner;

public class Area {
// Q.9063 / 성공
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
		int area;
		
		for(int i=0; i<n; i++) {
		
			int x = sc.nextInt();
			int y = sc.nextInt();
			minX = Math.min(minX, x);
			minY = Math.min(minY, y);
			maxX = Math.max(maxX, x);
			maxY = Math.max(maxY, y);
		}
//		
//		System.out.println("최소X : " + minX);
//		System.out.println("최대X : " + maxX);
//		System.out.println("최소Y : " + minY);
//		System.out.println("최대Y : " + maxY);
		
		area = (maxX - minX) * (maxY - minY); 
		System.out.println(area);
	}

}
