package Day1228;

import java.util.Scanner;

public class A2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,sum=0;
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		//같은 눈이 3개
		if(a==b&&b==c) {
			sum=10000+a*1000;
			
		}else {
			//같은 눈이 2개
			if(a==b) {
				sum=1000+a*100;
			}else if(a==c) {
				sum=1000+a*100;
			}else if(b==c) {
				sum=1000+b*100;
			}else {//모두 다를 떄
				int max;
				max=(a>b&&a>c)?a:(b>a&&b>c)?b:c;
				sum=max*100;
			}
		}
		
		System.out.println(sum);

	}

}
