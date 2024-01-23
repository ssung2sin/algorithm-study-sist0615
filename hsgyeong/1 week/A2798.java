package practice;

import java.util.Scanner;

public class A2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N;
		int M;
		int sum = 0;
		int answer = 0;

		N = sc.nextInt();
		M = sc.nextInt();

		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < N - 2; i++) {

			for (int j = i + 1; j < N - 1; j++) {

				for (int k = j + 1; k < N; k++) {
					sum = arr[i] + arr[j] + arr[k];

					if (sum == M) {
						answer = sum;
						break;
					}

					else if (sum < M && answer < sum)
						answer = sum;
				}
			}
		}
		System.out.println(answer);
	}

}
