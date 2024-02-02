package algorithm_5Week_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ4963 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			
			int [][] map = new int [h][w];
			boolean[][] visited = new boolean[h][w];
			if(w != 0 && h != 0) {
				for(int i = 0; i < h; i++) {
					for(int j = 0; j < w; j++) {
						map[i][j] = sc.nextInt();
					}
				}
				int count = 0;
				
				for(int i = 0; i < h; i++) {
					for(int j = 0; j < w; j++) {
						if(map[i][j] == 1 && !visited[i][j]) {	// 현재 위치가 땅이며 처음 밟는 경우
							bfs(map, visited, i, j, h, w);
							count++;
						}
					}
				}
				
				System.out.println(count);
			}
			else {
				break;
			}
		}
	}
	public static void bfs(int [][] map, boolean[][] visited, int startX, int startY, int h, int w) {
		int[] dx = {0, 0, -1, 1, -1, 1, -1, 1};
		int[] dy = {-1, 1, 0, 0, -1, -1, 1, 1};
		
		Queue<Integer> queueX = new LinkedList<>();
		Queue<Integer> queueY = new LinkedList<>();
		queueX.offer(startX);
		queueY.offer(startY);
		
		visited[startX][startY] = true;
		
		while (!queueX.isEmpty()) {
            int x = queueX.poll();
            int y = queueY.poll();

            for(int l = 0; l < 8; l++) {						// l이 8보다 작은이유 : 8방향을 검색해야해서
            	int nx = x + dx[l];
            	int ny = y + dy[l];
            	
            	if(nx >= 0 && nx < h && ny >= 0 && ny < w && map[nx][ny] == 1 && !visited[nx][ny]) {
            		queueX.offer(nx);
            		queueY.offer(ny);
            		visited[nx][ny] = true;
            	}
            }
        }
	}
}
