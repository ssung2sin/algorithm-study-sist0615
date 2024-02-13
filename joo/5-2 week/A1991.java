package baekjoon.week5_2;

import java.util.Scanner;

//Node 클래스는 이진 트리의 노드를 표현하는 클래스
class Node {
    char data;
    Node left, right;

  //생성자(public Node(char item))를 통해 노드를 초기화하고 왼쪽과 오른쪽 자식을 null로 설정함.
    public Node(char item) { 
        data = item;
        left = right = null;
    }
}

//BinaryTree 클래스는 이진 트리를 관리하는 클래스
class BinaryTree {
    Node root;

    //재귀적으로 트리를 순회하며 각 노드의 데이터를 출력_전위/중위/후위 순회
    
    // 전위 순회(root-left-right)
    void preOrderTraversal(Node node) {
        if (node == null) return;

        System.out.print(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    // 중위 순회(left-root-right)
    void inOrderTraversal(Node node) {
        if (node == null) return;

        inOrderTraversal(node.left);
        System.out.print(node.data);
        inOrderTraversal(node.right);
    }

    // 후위 순회(left-right-root)
    void postOrderTraversal(Node node) {
        if (node == null) return;

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data);
    }
}

public class A1991 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        //BinaryTree 클래스의 객체 tree를 생성합니다.
        BinaryTree tree = new BinaryTree();

        // 노드 정보 입력받아 트리 생성
        for (int i = 0; i < N; i++) {
            char parentData = scanner.next().charAt(0);
            char leftData = scanner.next().charAt(0);
            char rightData = scanner.next().charAt(0);

            // 루트 노드 생성
            if (tree.root == null) { //트리의 루트 노드가 아직 생성되지 않았다면 (첫 번째 노드의 경우)
                tree.root = new Node(parentData); //루트 노드가 됨.
            }

            // 노드 탐색 및 자식 노드 생성
            Node parentNode = findNode(tree.root, parentData); // 입력받은 부모 데이터로부터 해당 노드를 찾아낸다.
            //왼쪽 오른쪽 자식 노드가 있다면 부모노드와 연결하기
            if (leftData != '.') {
                parentNode.left = new Node(leftData);
            }

            if (rightData != '.') {
                parentNode.right = new Node(rightData);
            }
        }

        // 전위 순회
        tree.preOrderTraversal(tree.root);
        System.out.println();

        // 중위 순회
        tree.inOrderTraversal(tree.root);
        System.out.println();

        // 후위 순회
        tree.postOrderTraversal(tree.root);
        System.out.println();
    }

    // 노드 찾기
    static Node findNode(Node root, char data) {
        if (root == null) return null;
        if (root.data == data) return root;

        Node leftResult = findNode(root.left, data);
        if (leftResult != null) return leftResult;

        return findNode(root.right, data);
    }
}
