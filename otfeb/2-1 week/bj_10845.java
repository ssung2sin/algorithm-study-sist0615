package bj_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 큐
public class bj_10845 {

	static class Queue {
		int[] queue = new int[10000];
		int begin = 0;
		int end = 0;
		int db;
		
		void push(int data) {
			queue[end] = data;
			end++;
		}
		
		int pop() {
			if(begin != end) {
				db = queue[begin];
				queue[begin] = 0;
				begin++;
				return db;
			}
			else return -1;
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
			if (empty()) {
				return -1;
			}
			else {
				return queue[begin];
			}
		}
		
		int back() {
			if (!empty()) {
				return queue[end-1];
			}
			else {
				return -1;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		String cmdln;
		String cmd[] = new String[10];
		n = Integer.parseInt(br.readLine());
		Queue qu = new Queue();
		int i;
		String ans = "";
		
		for(i=0; i<n; i++) {
			cmdln = br.readLine();
			cmd = cmdln.split(" ");
			if(cmd[0].equals("push")) {		
				qu.push(Integer.parseInt(cmd[1]));
			}
			else if(cmd[0].equals("pop")) {
				if(!qu.empty()) {
					ans += qu.front() +"\n";
					qu.pop();
				}
				else {
					ans += "-1\n";
				}
			}
			else if(cmd[0].equals("size")) {
				ans += qu.size() + "\n";
			}
			else if(cmd[0].equals("empty")) {
				if(qu.empty()) {
					ans += "1\n";
				}
				else {
					ans += "0\n";
				}
			}
			else if(cmd[0].equals("front")) {
				if(!qu.empty()) {
					ans += qu.front() + "\n";
				}
				else {
					ans += "-1\n";
				}
			}
			else if(cmd[0].equals("back")) {
				if(!qu.empty()) {
					ans += qu.back() + "\n";
				}
				else {
					ans += "-1\n";
				}
			}
		}
		System.out.println(ans);
	}
	
}