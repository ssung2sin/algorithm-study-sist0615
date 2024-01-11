package bj_2024;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class bj_10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		
		String cmd;
		String[] cmdArr = new String[2];
		String result = "";

		while(n>0) {
			cmd = br.readLine();
			cmdArr = cmd.split(" ");
			
			if(cmdArr[0].equals("push_front")) {
				deque.addFirst(Integer.parseInt(cmdArr[1]));
			}
			else if(cmdArr[0].equals("push_back")) {
				deque.addLast(Integer.parseInt(cmdArr[1]));
			}
			else if(cmdArr[0].equals("pop_front")) {
				if(!deque.isEmpty()) {
					result+=deque.removeFirst()+"\n";
				}
				else {
					result+="-1\n";
				}
			}
			else if(cmdArr[0].equals("pop_back")) {
				if(!deque.isEmpty()) {
					result+=deque.removeLast()+"\n";
				}
				else {
					result+="-1\n";
				}
			}
			else if(cmdArr[0].equals("size")) {
				result+=deque.size()+"\n";
			}
			else if(cmdArr[0].equals("empty")) {
				if(deque.isEmpty()) {
					result+="1\n";
				}
				else {
					result+="0\n";
				}
			}
			else if(cmdArr[0].equals("front")) {
				if(!deque.isEmpty()) {
					result+=deque.getFirst()+"\n";
				}
				else {
					result+="-1\n";
				}
			}
			else if(cmdArr[0].equals("back")) {
				if(!deque.isEmpty()) {
					result+=deque.getLast()+"\n";
				}
				else {
					result+="-1\n";
				}
			}
			n--;
		}
		bw.write(result);
		bw.flush();
	}

}
