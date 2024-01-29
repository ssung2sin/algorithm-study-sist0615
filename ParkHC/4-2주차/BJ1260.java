package algorithm_4Week_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ1260 {
    public static int n;   // 정점의 개수
    public static int m;   // 간선의 개수
    public static int v;   // 시작할 정점의 번호
    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 정보 입력
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 양방향 간선 추가
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // 그래프 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        // DFS
        visited = new boolean[n + 1];
        dfs(v);
        System.out.println();

        // BFS
        visited = new boolean[n + 1];
        bfs(v);
        System.out.println();
    }

    public static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int next : graph.get(node)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int next : graph.get(current)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
}

