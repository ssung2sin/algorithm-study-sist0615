package bj_2024;

import java.util.Scanner;

public class bj_2745 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		int b = sc.nextInt();
		
		char[] nArr = n.toUpperCase().toCharArray();
		int[] nArrNum = new int[nArr.length];
		
		for(int i=0;i<nArrNum.length;i++) {
			if((int)nArr[i]>=65 && (int)nArr[i]<=90) {
				nArrNum[i] = (int)nArr[i]-55;
			}
			else if((int)nArr[i]>=48 && (int)nArr[i]<=57) {
				nArrNum[i] = (int)nArr[i]-48;
			}
		}
		
		int sum = 0;
		
		for(int j=nArr.length-1;j>=0;j--) {
			sum+=Math.pow(b, (nArr.length-1)-j)*nArrNum[j];
		}
		System.out.println(sum);
		
//		int n = 1*35+36*35+36*36*35+36*36*36*35+36*36*36*36*35;
//		System.out.println(n);
		sc.close();

	}

}
