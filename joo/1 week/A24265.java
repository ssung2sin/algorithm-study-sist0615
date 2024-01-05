package baekjoon.week1;

import java.util.Scanner;

public class A24265 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long x = (n-1)*n/2; //횟수
		long y = 2; //차수
		
		//횟수_경우의 수 > 합의 법칙 이용
		/* i=1)j=2~7(6개)
		 * i=2)j=3~7(5개)
		 * ...
		 * i=6)j=7(1개)
		 * 합의 법칙: 동시에 일어나지 않은 각각의 경우를 합한다. 6개+5개+...+1개 =>개수의 합을 구해야 함. (=횟수)
		 * 등차수열의 합 이용 : 공식 => n항,a1(처음항),an(마지막항)일 때,합은 Sn으로 계산 됨.
		 * Sn=n항*(a1처음항+an마지막항)/2
		 * Sn=(n-1)*(1+(n-1))/2 = (n-1)*n/2
		 * 이렇게 하면 n2-n/2이기 때문에 항상 차수는 제곱(2)이 나올 수 밖에 없다. */
		
		System.out.println(x);
		System.out.println(y);
	
	}

}
