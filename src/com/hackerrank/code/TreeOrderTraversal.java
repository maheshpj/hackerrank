package com.hackerrank.code;

class Node {
    int data;
    Node left;
    Node right;
}

public class TreeOrderTraversal {

    public static void main(String[] args) {
        Node root = new Node();
        root.data = 3;

        Node root2 = new Node();
        root2.data = 5;
        Node root3 = new Node();
        root3.data = 2;
        root.left = root2;
        root.right = root3;

        Node root4 = new Node();
        root4.data = 1;
        Node root5 = new Node();
        root5.data = 4;
        root2.left = root4;
        root2.right = root5;

        Node root6 = new Node();
        root6.data = 6;
        root3.right = root6;

        preOrder(root);
        System.out.println();

        postOrder(root);
        System.out.println();

        inOrder(root);
        System.out.println();

        Node root7 = new Node();
        root7.data = 7;
        root6.right = root7;

        int height = height(root, 0, 0);
        System.out.println("height: " + height);

        topView(root);
    }

    static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        if (root.left != null)
            preOrder(root.left);
        if (root.right != null)
            preOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null)
            return;
        if (root.left != null)
            postOrder(root.left);
        if (root.right != null)
            postOrder(root.right);
        System.out.print(root.data + " ");
    }

    static void inOrder(Node root) {
        if (root == null)
            return;
        if (root.left != null)
            inOrder(root.left);
        System.out.print(root.data + " ");
        if (root.right != null)
            inOrder(root.right);
    }

    static int height(Node root, int height, int maxHeight) {
        if (root == null)
            return maxHeight;
        if (root.left != null)
            maxHeight = height(root.left, height + 1, maxHeight);
        if (root.right != null)
            maxHeight = height(root.right, height + 1, maxHeight);
        if (maxHeight < height)
            maxHeight = height;

        return maxHeight;
    }

    static void topView(Node root) {
        if (root == null)
            return;
        leftTopView(root);
        rightTopView(root.right);
    }

    static void leftTopView(Node root) {
        if (root == null)
            return;
        if (root.left != null)
            leftTopView(root.left);
        System.out.print(root.data + " ");
    }

    static void rightTopView(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        if (root.right != null)
            rightTopView(root.right);
    }
    
    static void LevelOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        if (root.left != null)
            LevelOrder(root.right);
        
    }

}
