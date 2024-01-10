package practice;

import java.util.Scanner;

public class Dice {

	public static void main(Strings[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        
	        int A;
	        int B;
	        int C;
	        int answer = 0;
	        
	        A = sc.nextInt();
	        B = sc.nextInt();
	        C = sc.nextInt();
	        
	        if(A==B&&A==C&&B==C)
	            answer = 10000+(A*1000);
	        else if(A==B&&A!=C&&B!=C)
	            answer = 1000+(A*100);
	        else if(B==C&&B!=A&&A!=C)
	            answer = 1000+(B*100);
	        else if(C==A&&C!=B&&A!=B)
	            answer = 1000+(C*100);
	        else if(C!=A&&B!=A&&B!=C)
	        if(A>C&&A>B)
	        answer = A*100;
	        else if(B>C&&B>A)
	            answer = B*100;
	        else 
	            answer = C*100;
	        System.out.println(answer);
	
	}
}
