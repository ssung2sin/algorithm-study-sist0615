package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A9063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

		try {
	
			int N=Integer.parseInt(bf.readLine()); //점의 갯수
			
			int minCompareX=Integer.MAX_VALUE;//x 최솟값 비교를 위해 integer.max_value 선언
			int maxCompareX=Integer.MIN_VALUE; //x 최댓값 비교를 위해 integer.min_value 선언
			int minCompareY=Integer.MAX_VALUE; //y 최솟값 비교를 위해 integer.max_value 선언
			int maxCompareY=Integer.MIN_VALUE; //y 최댓값 비교를 위해 integer.min_value 선언
			
			for(int i=0;i<N;i++) {
				StringTokenizer st=new StringTokenizer(bf.readLine());
				
				int x=Integer.parseInt(st.nextToken());
				int y=Integer.parseInt(st.nextToken());
				
				//값이 들어오는 것에 따라 최소 최대 비교
				//math.min(a,b) : a와 b를 비교하여 최솟값 , math.max(a,b) : a와 b를 비교하여 최댓값 출력
				minCompareX=Math.min(minCompareX, x);
				maxCompareX=Math.max(maxCompareX, x);
				minCompareY=Math.min(minCompareY, y);
				maxCompareY=Math.max(maxCompareY, y);
				
				
			}
			int extent=(maxCompareX-minCompareX)*(maxCompareY-minCompareY);
			System.out.println(extent);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
