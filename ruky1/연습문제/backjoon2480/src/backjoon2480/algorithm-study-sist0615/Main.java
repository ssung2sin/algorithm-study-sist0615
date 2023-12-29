package backjoon2480;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		int prize;
		
		if(a == b && b == c) {
			prize=10000 + a*1000;
		}else if(a == b || a == c) {
			prize=1000 + a*100;
        }else if(b == c) {
        	prize=1000 + b*100;
        }else {
        	prize=Math.max(Math.max(a, b), c)*100;
        }
		System.out.print(prize);
		/*request 123*/
	}

}
