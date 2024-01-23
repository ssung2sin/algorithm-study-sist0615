package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2480 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		// 최대수를 구해야하므로 배열을 쓰는것이 좋음
		int[] number = new int[3];
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		// 3개 모두 같을때
		if (number[0] == number[1] && number[1] == number[2]) {
			System.out.println(10000 + number[0] * 1000);
		// 2개만 같을때
		} else if (number[0] == number[1] || number[0] == number[2]) {
			System.out.println(1000 + number[0] * 100);
		} else if(number[1] == number[2] || number[0] == number[2]) {
			System.out.println(1000 + number[2] * 100);
		} else if(number[1] == number[0] || number[1] == number[2]){
			System.out.println(1000 + number[1] * 100);
		}else {
			int maxNumber = 0;
			for (int i = 0; i < 3; i++) {
				if (maxNumber < number[i]) {
					maxNumber = number[i];
				}
			}
			System.out.println(maxNumber * 100);
		}
	}

}
