package bj_2024;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_4963 {
	
	static int[][] map;
	static int landNum = 0;						//섬의 개수
	static int cnt = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String s = br.readLine();
			
			if(s.equals("0 0")) {
				break;
			}
			else {
				StringTokenizer st = new StringTokenizer(s);
				int w = Integer.parseInt(st.nextToken());			//지도의 너비
				int h = Integer.parseInt(st.nextToken());			//지도의 높이
				
				map = new int[w+10][h+10];							//지도 생성
				
					for(int j=1;j<=h;j++) {
						String[] landOrSea = br.readLine().split(" ");			//땅 = 1 , 바다 = 0
						for(int i=1;i<=landOrSea.length;i++) {
							map[i][j] = Integer.parseInt(landOrSea[i-1]);			//지도 값 넣어주기
						}
						
					}
				
				dfs(1,1,w,h);										//(0,0) 부터 탐색 시작
				
				if(cnt == 0) {
					bw.write(0+"\n");
				}
				else {
					if(cnt == landNum) {
						bw.write(landNum+"\n");
						landNum = 0;										//섬 개수 초기화
						cnt = 0;
					}
					else {
						bw.write((landNum+1)+"\n");
						landNum = 0;										//섬 개수 초기화
						cnt = 0;
					}
				}
				
			}
		}
		bw.flush();
		bw.close();
	}

	private static void dfs(int x, int y, int w, int h) {

		if(w == 1 && h == 1) {
			if(map[w][h] == 1) {
				landNum++;
				return;
			}
			else {
				return;
			}
		}
		else {
			if(map[y][x] == 1) {
				cnt++;
			}
			if(map[y][x] == 1 && map[y][x-1] != 1 && map[y+1][x-1] != 1 && 
				map[y+1][x] != 1 && map[y+1][x+1] != 1 && map[y][x+1] != 1 && 
				map[y-1][x+1] != 1 && map[y-1][x] != 1 && map[y-1][x-1] != 1 ) {		//인접한 섬의 유무
				landNum++;
				if(w > y) {								//y좌표가 너비 보다 작을때까지 이동
					dfs(x,y+1,w,h);	
				}
				else {
					if(h > x) {
						y = 1;							//y좌표 0으로 초기화
						dfs(x+1,y,w,h);					//한줄 탐색 끝내고 다음줄
					}
					else {
						return;							//모든 좌표 탐색 완료
					}
				}
			}
			else {
				if(w > y) {
					dfs(x,y+1,w,h);	
				}
				else {
					if(h > x) {
						y = 1;
						dfs(x+1,y,w,h);
					}
					else {
						return;
					}
				}
			}
		}
		
	}

}
