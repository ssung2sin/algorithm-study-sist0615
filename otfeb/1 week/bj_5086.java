package bj_2024;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_5086 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String s = br.readLine();
			
			if(s.equals("0 0")) {
				break;
			}
			else {
				String[] arr = s.split(" ");
				if(Integer.parseInt(arr[1]) % Integer.parseInt(arr[0]) == 0) {
					bw.write("factor\n");
				}
				else if(Integer.parseInt(arr[0]) % Integer.parseInt(arr[1]) == 0) {
					bw.write("multiple\n");
				}
				else {
					bw.write("neither\n");
				}
			}
		}
		bw.flush();
	}
}
