package algorithm_5Week_1;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ2606 {
	
	public static int computer;					
    public static int connect;					
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int computer = sc.nextInt();
		int connect = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i <= computer; i++) {
            graph.add(new ArrayList<>());
        }
		
		for (int i = 0; i < connect; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
		
		boolean[] visited = new boolean[computer + 1];
		
		int result = dfs(graph, visited, 1);
		
		System.out.println(result-1);
	}
	
	public static int dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int node) {
        visited[node] = true;
        int count = 1;
        
        for (int next : graph.get(node)) {
            if (!visited[next]) {
                count += dfs(graph, visited, next);
            }
        }
		return count;
    }
}
