import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class A1260 {
	static int[][] edge;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nodeCount = sc.nextInt(); // 정점의 개수
		int edgeCount = sc.nextInt(); // 간선의 개수
		int startNode = sc.nextInt(); // 시작할 정점

		HashSet<Integer> node = new HashSet<>(); // 정점 담을 HashSet
		for (int i = 1; i <= nodeCount; i++) { // 정점 담아놓기
			node.add(i);
		}

		for (int i = 0; i < edgeCount; i++) { // edge 입력받기
			for (int j = 0; j < 2; j++) {
				edge[i][j] = sc.nextInt();
			}
		}

		dfs(node, edge, nodeCount, edgeCount, startNode);
		bfs(edge, nodeCount, edgeCount, startNode);
	}

	public static void dfs(HashSet<Integer> node, int[][] edge, int nodeCount, int edgeCount, int startNumber) {

		System.out.print(startNumber + " "); // 시작번호 일단 출력
		ArrayList<Integer> nodeList = new ArrayList<>(node);
		nodeList.remove(startNumber);
		Collections.sort(nodeList);
		if (!nodeList.isEmpty()) { // HashSet에 숫자가 있으면..
			int currentNode = startNumber; // 시작번호부터 시작.. // 현재 번호
			for (int k = 0; k < nodeCount - 1; k++) { // 시작 번호를 제외한 나머지 번호 찾기의 반복횟수
				for (int i = 0; i < edgeCount; i++) { // 번호 찾기 시작
					if (edge[i][0] == currentNode) {
						nodeList.contains(edge[i][1]); //
					} else {
						// edge[i][1] == currentNode
					}
				}
			}
		}
	}

	public static void bfs(int[][] edge, int nodeCount, int edgeCount, int startNumber) {

	}

}
