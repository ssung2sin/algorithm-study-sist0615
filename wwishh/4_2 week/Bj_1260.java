/* 혼자 작성했던 코드
package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj_1260 {

	static List<Integer> dfsArr = new ArrayList<Integer>();
	static List<Integer> bfsArr = new ArrayList<Integer>();

	public static void dfs(int[][] graph, int n, int m, int v) {

		dfsArr.add(v);
		int min = 1000;

		for (int i = 0; i < graph.length; i++) {
			if (graph[i][0] == v) {
				min = Math.min(min, graph[i][1]);
			} else if (graph[i][1] == v) {
				min = Math.min(min, graph[i][0]);
			}

		}
		if (n <= m) {
			for (int i = 0; i < n; i++)
				dfs(graph, n ,m, min);
		} else {
			for(int i=0; i<m; i++)
				dfs(graph, n ,m, min);
		}
		
		dfsArr.add(min);

	}

	public static List<Integer> bfs(int[][] graph, int v) {

		return bfsArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 정점의 개수
		int m = sc.nextInt(); // 간선의 개수
		int v = sc.nextInt(); // 정점의 번호

		int[][] graph = new int[m][2];

		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[0].length; j++) {
				graph[i][j] = sc.nextInt();
			}
		}

		dfs(graph, n, m, v);
		bfs(graph, v);

		System.out.println(dfsArr);
		System.out.println(bfsArr);

	}

}*/


//gpt랑 합작
package baekjoon;

import java.util.*;

public class Bj_1260 {

    static List<Integer> dfsArr = new ArrayList<>();
    static List<Integer> bfsArr = new ArrayList<>();

    public static void dfs(int[][] graph, boolean[] visited, int v) {
        visited[v] = true;
        dfsArr.add(v);

        List<Integer> nextVertices = getNextVertices(graph, v);

        for (int next : nextVertices) {
            if (!visited[next]) {
                dfs(graph, visited, next);
            }
        }
    }

    public static void bfs(int[][] graph, boolean[] visited, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            bfsArr.add(current);

            List<Integer> nextVertices = getNextVertices(graph, current);

            for (int next : nextVertices) {
                if (!visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                }
            }
        }
    }

    private static List<Integer> getNextVertices(int[][] graph, int v) {
        List<Integer> nextVertices = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            if (graph[i][0] == v) {
                nextVertices.add(graph[i][1]);
            } else if (graph[i][1] == v) {
                nextVertices.add(graph[i][0]);
            }
        }
        Collections.sort(nextVertices);
        return nextVertices;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정점의 개수
        int m = sc.nextInt(); // 간선의 개수
        int v = sc.nextInt(); // 시작 정점 번호

        int[][] graph = new int[m][2];
        boolean[] visited = new boolean[n + 1];

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        // 간선을 입력 받을 때 정점 번호가 작은 순서대로 정렬
        for (int i = 0; i < m; i++) {
            if (graph[i][0] > graph[i][1]) {
                int temp = graph[i][0];
                graph[i][0] = graph[i][1];
                graph[i][1] = temp;
            }
        }

        dfs(graph, visited, v);
        visited = new boolean[n + 1]; // 초기화
        bfs(graph, visited, v);
        
        for(int data : dfsArr) {
        	System.out.print(data + " ");
        }
        System.out.println();
        for(int data : bfsArr) {
        	System.out.print(data + " ");
        }

        
    }
}


