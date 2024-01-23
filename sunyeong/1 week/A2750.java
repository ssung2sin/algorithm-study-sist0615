package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class A2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int N=Integer.parseInt(bf.readLine());
			int [] arr=new int [N];
			for(int i=0;i<N;i++) {
				
				arr[i]=Integer.parseInt(bf.readLine());
				
			}
			//배열을 오름차순으로 정렬
			Arrays.sort(arr);
			
			//오름차순으로 정렬한 배열 출력형태에 맞춰 출력
			for(int get_arr:arr) {
				System.out.println(get_arr);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
