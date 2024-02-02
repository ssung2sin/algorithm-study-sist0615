package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_1991 {

    static Node head = new Node('A', null, null);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 입력을 받아 이진 트리를 구성하는 부분
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            insertNode(head, root, left, right);
        }

        // 전위 순회 결과 출력
        preOrder(head);
        System.out.println();

        // 중위 순회 결과 출력
        inOrder(head);
        System.out.println();

        // 후위 순회 결과 출력
        postOrder(head);
        System.out.println();
    }

    // 이진 트리의 노드 클래스
    static class Node {
        char value;
        Node left;
        Node right;

        Node(char value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    // 이진 트리에 노드를 삽입하는 메서드
    public static void insertNode(Node temp, char root, char left, char right) {
        if (temp.value == root) {
            temp.left = (left == '.' ? null : new Node(left, null, null));
            temp.right = (right == '.' ? null : new Node(right, null, null));
        } else {
            if (temp.left != null)
                insertNode(temp.left, root, left, right);
            if (temp.right != null)
                insertNode(temp.right, root, left, right);
        }
    }

    // 전위 순회를 수행하는 메서드
    public static void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.value); // 현재 노드의 값을 출력
        preOrder(node.left); // 왼쪽 서브트리를 전위 순회
        preOrder(node.right); // 오른쪽 서브트리를 전위 순회
    }

    // 중위 순회를 수행하는 메서드
    public static void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left); // 왼쪽 서브트리를 중위 순회
        System.out.print(node.value); // 현재 노드의 값을 출력
        inOrder(node.right); // 오른쪽 서브트리를 중위 순회
    }

    // 후위 순회를 수행하는 메서드
    public static void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left); // 왼쪽 서브트리를 후위 순회
        postOrder(node.right); // 오른쪽 서브트리를 후위 순회
        System.out.print(node.value); // 현재 노드의 값을 출력
    }
}




