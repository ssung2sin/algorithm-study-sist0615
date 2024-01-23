package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int maxYakSu = 0; // 최대공약수
		int minBaeSu = 0; // 최소공배수
		int remain = 0; // 나머지
		int mutiply =A*B; //두수의곱

		if (A > B) {
			if (A % B == 0) {
				maxYakSu = B;
				minBaeSu = A;
			} else {
				//A B 아직 미지정 상태
				//A=648 B=232 remain= 184 232%184 B%remain
				//A=232 B=184 remain=48 184%48 B%remain
				//A=184 B=48 remain=40 48%40 B%remain
				//A=48 B=40 remain=8 40%8 B%remain
				//A=40 B=8 remain=0 while문 빠져나감

				while (B != 0) {
					remain = A % B;
					//결국 A자리에 B가오고 B자리에 remain이 온다
					A = B;
					B = remain;
				}
				maxYakSu = A;
				minBaeSu = mutiply / maxYakSu;

			}
		}
		if (B > A) {
			if (B % A == 0) {
				maxYakSu = A;
				minBaeSu = B;
			} else {
				while (A != 0) {
					remain = B % A;
					B = A;
					A = remain;
				}
				maxYakSu = B;
				minBaeSu = mutiply / maxYakSu;
			}
		} 


		if(A==B) {
			maxYakSu = A;
			minBaeSu = A;
		}


		System.out.println(maxYakSu + "\n" + minBaeSu);

	}
}
