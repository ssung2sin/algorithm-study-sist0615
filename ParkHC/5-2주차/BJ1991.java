package algorithm_5Week_2;

import java.util.Scanner;

public class BJ1991 {
    
    static class tree {
        char value;
        tree left;
        tree right;

        public tree(char value, tree left, tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    static tree head = new tree('A', null, null);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();

        for (int i = 0; i < node; i++) {
            // 수정된 부분
            String root = sc.next();
            String left = sc.next();
            String right = sc.next();

            addTree(head, root.charAt(0), left.charAt(0), right.charAt(0));
        }

        preorder(head);
        System.out.println();
        inorder(head);
        System.out.println();
        postorder(head);
    }

    public static void addTree(tree node, char root, char left, char right) {
        if (node == null) {
            return;
        }

        if (node.value == root) {
            // 수정된 부분
            node.left = (left == '.' ? null : new tree(left, null, null));
            node.right = (right == '.' ? null : new tree(right, null, null));
        } else {
            addTree(node.left, root, left, right);
            addTree(node.right, root, left, right);
        }
    }

    private static void preorder(tree t) {
        if (t == null) {
            return;
        }
        System.out.print(t.value);
        preorder(t.left);
        preorder(t.right);
    }

    private static void inorder(tree t) {
        if (t == null) {
            return;
        }
        inorder(t.left);
        System.out.print(t.value);
        inorder(t.right);
    }

    private static void postorder(tree t) {
        if (t == null) {
            return;
        }
        postorder(t.left);
        postorder(t.right);
        System.out.print(t.value);
    }
}
