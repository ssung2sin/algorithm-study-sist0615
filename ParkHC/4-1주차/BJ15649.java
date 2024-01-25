package algorithm_4Week_1;

import java.util.Scanner;

public class BJ15649 {
//	문제 이해를 목해서 해당 블로그를 참고해서 코드를 작성했습니다
//	https://infodon.tistory.com/55
	static StringBuilder sb  = new StringBuilder();;
	static int n;
	static int m;
	static int[] arr;
	static boolean[] choice;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		choice = new boolean[n];
	
		dfs(0);
		System.out.println(sb);
	}
	
	public static void dfs(int depth) {
		if(depth == m) {
			for(int t : arr) {
				sb.append(t).append(" ");
			}
			sb.append("\n");
			return;
		}	
		
		for(int i = 0; i < n; i++) {
			if(!choice[i]) {
				choice[i] = true;
				arr[depth] = i + 1;
				dfs(depth + 1);
				choice[i] = false;
			}
		}
		
	}
}
