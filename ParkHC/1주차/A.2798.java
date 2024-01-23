package algorithm_1Week;

import java.util.Scanner;

public class BlackJack {
// Q. 2798 / 성공
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = card(arr, n, m);
		
		System.out.println(result);
	}
	
	static int card(int [] arr, int n, int m) {
		int result = 0;
		
		for (int a = 0; a < n-2; a++) {

			 for (int b = a+1; b < n-1; b++) {
				
				for(int c = b+1; c < n; c++) {
					
					int sum = arr[a] + arr[b] + arr[c];
					
					if(m == sum) {
						return sum;
					}
					
					if(result < sum && sum < m) {
						result = sum;
					}
				}
					
			}
			
		}
		
		return result;
	}

}
