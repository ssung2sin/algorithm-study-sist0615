package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15649 {

	//1 필요한 값들 static으로 선언
	public static int N,M;
	public static int [] arr;
	public static boolean[] visit;
	public static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/* 내풀이
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.println(i+" "+j);
			}
		}
		*/
		
		//https://infodon.tistory.com/55 참고
		//너무 어려워서 풀다가 포기하고 설명이 잘된 정리글을 찾다가 찾은 tistory입니다.
		//진행과정을 세분화해서 설명해주는 블로그라 조금은? 더 이해할 수 있던 것 같아 주소 남깁니다
		
		//진행과정을 하나씩 코드로 써가면서 이해하니까 조금 더 수월했어요! 말로는 설명하기 힘들듯;;
		
		//https://st-lab.tistory.com/114 이 블로그와 병합해서 풀었으니 위 url에서 개념 잡고 섞어서 풀어보면 좋을듯 싶습니다
		//이 블로그의 boolean 배열 visit 사용법을 이해하시면 좋을 것 같습니다
		
		
		//2 입력받을 값과 배열 초기화
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		arr=new int[M];
		visit=new boolean[N];
		
		//8 초기값 0을 넣어주기 // 정적변수를 쓰면 되기 때문에 굳이 N과 M을 넘겨줄 필요 없다.
		dfs(0);
		//9 마지막 출력
		System.out.println(sb);
	}
	
	public static void dfs(int depth) {
		
		//4 depth==M이 될 경우 탐색종료
		if(depth==M)
		{
			//5 길이가 선언된 arr을 t에 박기
			for(int t:arr)
			{
				//6 StringBuilder에 arr을 넣은 t와 공백 추가
				sb.append(t).append(" ");
			}
			//7 개행문자추가로 줄바꾸기 + for문 종료시 재귀 종료
			sb.append("\n");
			return;
		}
		
		//3 파라메터에 int a 추가 후 int depth추가 해서 깊이탐색
		for(int i=0;i<N;i++)
		{
			if(!visit[i])
			{
				visit[i]=true;
				arr[depth]=i+1;
				dfs(depth+1);
				visit[i]=false;
			}
		}
	}

}
