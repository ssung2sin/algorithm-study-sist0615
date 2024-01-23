package Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A5086 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int data;
		
		//입력받은 값의 수가 자연수라면 list에 넣기
		while((data=sc.nextInt())>0) {
			list.add(data);
		}
		
		for(int i=0; i<list.size(); i+=2) {
			
			int a=list.get(i);
			int b=list.get(i+1);
			
			if(a>b) {
				if(a%b==0) {//a는 b의 배수
					System.out.println("multiple");
				}else {
					System.out.println("neither");
				}
			}else {
				if(b%a==0) {//a는 b의 약수
					System.out.println("factor");
				}else {
					System.out.println("neither");
				}
			}
			
		}
		

	}

}
