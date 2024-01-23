package bj_2024;

import java.util.Scanner;

public class bj_1158 {
	
	static class Queue {
		
		int begin = 0;
		int end = 0;
		int[] queue = new int[100000000];		//List 또는 ArrayList 사용 권장..
		int db;
		
		void push(int data) {
			queue[end] = data;
			end++;
		} 
		
		int pop() {
			if(begin != end) {
				db = queue[begin];
				queue[begin] = 0;				//pop했다는 의미(안해주어도 무방)
				begin++;
				return db;
			}
			else {
				return -1;
			}
		}
		
		int size() {
			return end-begin;
		}
		
		boolean empty() {
			if(begin == end) {
				return true;
			}
			else {
				return false;
			}
		}
		
		int front() {
			return queue[begin];
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();		//사람 수
		int k = scanner.nextInt();		//k번째 사람 제거
		Queue qu = new Queue();
		String ans = "";
		int p,a,b,c;						//p는 순열에 넣는 숫자

		for(a=1; a<=n; a++) {
			qu.push(a);						//순서대로 큐에 push
		}
		for(b=0;b<n;b++) {
			if(n==1 && k==1) {				//1 1 입력시
				ans += "<1>";
				break;
			}
			for(c=0; c<k-1; c++) {
				qu.push(qu.front());
				qu.pop();
			}
			p = qu.pop();
			if(b==0) {
				ans += "<"+p+", ";
			}
			else if(b==n-1) {
				ans += p+">";
			}
			else {
				ans += p+", ";
			}
		}
		System.out.println(ans);
	}
}


