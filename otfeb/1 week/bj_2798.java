package bj_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2798 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String card = br.readLine();
		String[] arr = card.split(" ");
		
		int r = 0;
		int sum = 0;

		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				for(int k=2;k<n;k++) {
					if(i!=j && j!=k && k!=i) {
						sum = Integer.parseInt(arr[i])+Integer.parseInt(arr[j])+Integer.parseInt(arr[k]);
						if(sum==m) {
							r = sum;
						}
						else if(sum<m && sum>=r) {
							r = sum;
						}
					}
				}
			}
		}
		System.out.println(r);
	}

}

