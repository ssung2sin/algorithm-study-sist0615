package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class B1476 {

	public static void main(String[] args) throws IOException {

		/* 내 풀이
		Scanner sc=new Scanner(System.in);
		
		int E=sc.nextInt();
		int S=sc.nextInt();
		int M=sc.nextInt();
		
		int year=0;
		
		while(true)
		{
			if(!(1<=E && E<=15))
			{
				E=E%15;
			}
			else if(!(1<=S && S<=28))
			{
				S=S%28;
			}
			else if(!(1<=M && M<=19))
			{
				M=M%19;
			}
			
			if(1<=E && E<=15)
			{
				year+=E%15;
			}
			else if(1<=S && S<=28)
			{
				year+=S%28;
			}
			else if(1<=M && M<=19)
			{
				year+=M%19;
			}
			
			System.out.println(year);
		}*/
		
		Scanner sc=new Scanner(System.in);
		
		//while 루프 break용
		int e=sc.nextInt();
		int s=sc.nextInt();
		int m=sc.nextInt();
		int E=0;
		int S=0;
		int M=0;
		
		int year=0;
		
		
		//while 루프를 탈출할 방법을 하나 배웠고
		//간단하게 생각했으면 더 쉬웠을텐데 어렵게 해본 것 같다...
		while(true)
		{
			year++;
			E++;
			S++;
			M++;
			
			if(E==16)
				E=1;

			if(S==29)
				S=1;

			if(M==20)
				M=1;
			
			if(e==E && s==S && m==M)
				break;
		}
		
		System.out.print(year);
		
	}
}
