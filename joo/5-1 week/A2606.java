package baekjoon.week5_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// DFS와 BFS로 푸는 문제
/* ========
 * 입력
 * 7 //컴퓨터의 수 computer
 * 6 //네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수 connection
 * c1/c2
 * 1 2 (i=0)
 * 2 3 (i=1)
 * 1 5 (i=2)
 * 5 2 (i=3)
 * 5 6 (i=4)
 * 4 7 (i=5)
 * ========
 * 출력
 * 4
 */

public class A2606 {

	static int computer; //컴퓨터의 수
    static int connection;//네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수
    static ArrayList<ArrayList<Integer>> network = new ArrayList<>();
    static boolean[] visited; //노드 방문여부 판단
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 컴퓨터 수와 연결 정보를 입력받음
        computer = Integer.parseInt(br.readLine());
        connection = Integer.parseInt(br.readLine());

        // 컴퓨터 수만큼 ArrayList를 초기화 : [[]],[[],[]],[[],[],[]]...,[[],[],[],[],[],[],[],[]]
        for (int i = 0; i <= computer; i++) {  //0~7 : 0,1,2,3,4,5,6,7(8개)
            network.add(new ArrayList<>());
        }
        
        //초기 상태(computer가 7인 경우) visited: [false, false, false, false, false, false, false, false]
        visited = new boolean[computer + 1];

        // 연결 정보를 입력받아 인접 리스트를 생성
        // 연결된 수만큼 반복해
        for (int i = 0; i < connection; i++) { //i=0~5까지
            StringTokenizer st = new StringTokenizer(br.readLine());
            int com1 = Integer.parseInt(st.nextToken());
            int com2 = Integer.parseInt(st.nextToken());

            // ex. network.get(com1) : network 리스트에서 com1 인덱스에 해당하는 ArrayList를 가져옵니다
            // get은 인덱스번호를 가져옴!(노드라고 생각해)
            network.get(com1).add(com2); //com1에 com2를 추가하겠다.
            network.get(com2).add(com1); //com2에 com1을 추가하겠다.
            
            // network : [ [], [2, 5], [1, 3, 5], [2], [7], [1, 2, 6], [5], [4] ]

            
        }

        // DFS를 통해 연결된 컴퓨터 수를 계산
        // 문제에서 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램을 작성하라고 했기에 시작 노드인 1을 적어줌.
        dfs(1);
        
        // 결과 출력
        System.out.println(count);
    }

    // dfs
    // int v : 현재 방문하고 있는 컴퓨터의 번호
    static public void dfs(int vistedCom) {
    	
        visited[vistedCom] = true; // 방문하면 true
        //문제에서 1번 컴퓨터는 무조건 방문이니깐 true가 됨.
        
        for (int num : network.get(vistedCom)) { 
        	// for (int num : network.get(1)) 
        	// => 1번 노드에 연결된 노드들을 순회 : [2, 5]
        	// dfs(2) : for (int num : network.get(2))
        	// => 2번 노드에 연결된 노드들을 순회 : [1, 3, 5]
        	// dfs(3) : for (int num : network.get(3))
        	// => 3번 노드에 연결된 노드들을 순회 : [2]
        	// 이런식으로 돌아감
            
        	// 방문하지 않은 컴퓨터라면 재귀함수로 관계된 컴퓨터로 연결하면서 count 증가시킴
        	// if (!visited[2])
        	// if (!visited[1]) ... X
        	// if (!visited[3])
        	// if (!visited[2]) ... X
        	// 다시 dfs(2)로 돌아가서 if (!visited[5]) 이런식으로 하게 됨.
        	if (!visited[num]) { 
            	//연결된 다른 컴퓨터들을 계속해서 탐색
        		// dfs(2)
        		// dfs(3)
                dfs(num);  
                // 재귀적인 호출을 통해 연결된 모든 컴퓨터를 방문한 후에 count를 1씩 증가시킵니다.
                count++;
            }
        }
    }
}
