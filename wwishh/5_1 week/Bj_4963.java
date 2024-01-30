package baekjoon;

import java.util.Scanner;

public class Bj_4963 {

    private static final int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1}; // 좌표 이동을 위한 배열
    private static final int[] dy = {0, 0, -1, 1, -1, 1, -1, 1}; // 좌표 이동을 위한 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();

            if (w == 0 && h == 0)
                break;

            int[][] map = new int[h][w];

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            int islandCount = countIslands(map);
            System.out.println(islandCount);
        }
    }

    private static int countIslands(int[][] map) {
        int count = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 1) {
                    count++; // 새로운 섬을 발견하면 섬의 개수를 증가시킴
                    dfs(map, i, j); // 해당 섬을 탐색하고 이미 탐색한 부분은 -1로 표시
                }
            }
        }

        return count;
    }

    //gpt가 만들어 준 메소드
    private static void dfs(int[][] map, int x, int y) {
        if (x < 0 || y < 0 || x >= map.length || y >= map[0].length || map[x][y] != 1) {
            return;
        }

        // 현재 정점을 방문했다고 표시
        map[x][y] = -1;

        // 인접한 정점들에 대해 DFS 호출(상하좌우와 대각선 위치)
        for (int i = 0; i < 8; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            dfs(map, newX, newY);
        }
    }
}

