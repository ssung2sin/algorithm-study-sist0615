package algorithm_3Week_2;

import java.util.Scanner;

public class BJ11053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrLength = sc.nextInt();
		int arr[] = new int[arrLength + 1];
		int dp[] = new int[arrLength + 1];
		
		for(int i = 1; i <= arrLength; i++) {
			arr[i] = sc.nextInt();				// 배열이 존재할때 최소 1
		}
		
		int increase = 1;
		
		for (int i = 1; i <= arrLength; i++) {
            dp[i] = 1;

            for (int j = 1; j < i; j++) {
                if (arr[j] < arr[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
            increase = Math.max(increase, dp[i]);
        }
		
		System.out.println(increase);
	}

}
