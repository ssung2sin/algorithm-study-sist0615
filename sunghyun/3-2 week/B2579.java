package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2579 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int total=Integer.parseInt(br.readLine());
		int score[]=new int[301]; //stair_cnt(갯수)에 +1추가
		
		//계단수 추가
		int stair[]=new int[301];
		
		//int total_score=0;
		
		//범위 0~(갯수-1개)에서 1~갯수로 변경
		for(int i=1;i<=total;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			//int score=Integer.parseInt(st.nextToken());
			
			//점수 따로 선언 안하고 바로 입력으로 변환
			stair[i]=Integer.parseInt(st.nextToken());
		}
		
		/*
		 * score[0]=score[0];
		 * score[1]=score[1];
		 * 에서 변경
		 * */
		score[1]=stair[1];
		score[2]=stair[1]+stair[2];
		score[3]=Math.max(stair[1], stair[2])+stair[3];

		for(int i=4;i<=total;i++)
		{
			/*total_score=stair_score[0]+stair_score[1]+stair_score[stair_cnt-1];
				total_score+=stair_score[stair_cnt-3];*/
			score[i]=Math.max(score[i-3] + stair[i-1], score[i-2])+stair[i];
		}
			
		bw.write(Integer.toString(score[total]));
		
		//bw.write(Integer.toString(total_score));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
