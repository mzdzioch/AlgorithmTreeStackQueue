package com.zdzioch;

import java.util.*;

/**
 * Created by mzdzioch on 2017-09-23.
 */
public class Tree {

    private Node root;
    private Queue<Node> queue = new LinkedList<>();


    public Tree(int[][] T) {
        Node[] nodes = new Node[T.length];

        for(int i = 0; i < T.length; i++) {
            nodes[i] = new Node(T[i][0]);
        }

        for(int i = 0; i < nodes.length; i++) {
            if(!((T[i][1]) == 0)) nodes[i].setLeft(nodes[T[i][1]]);

            if(!((T[i][2]) == 0)) nodes[i].setRight(nodes[T[i][2]]);
        }

        this.root = nodes[0];
    }

    public void preOrder() {
        displayDFSPreOrder(root);
        System.out.println("");
    }

    public void inOrder() {
        displayDFSInOrder(root);
        System.out.println("");
    }

    public void postOrder() {
        displayDFSPostOrder(root);
        System.out.println("");
    }

    public void treeBFS() {
        displayBFS(root);
        System.out.println("");
    }

    private void displayDFSPreOrder(Node node) {

        if(node != null) {
            System.out.print(node.getValue() + " ");

            displayDFSPreOrder(node.getLeft());

            displayDFSPreOrder(node.getRight());

        }
    }

    private void displayDFSInOrder(Node node) {

        if(node != null) {
            displayDFSInOrder(node.getLeft());

            System.out.print(node.getValue() + " ");

            displayDFSInOrder(node.getRight());
        }
    }

    private void displayDFSPostOrder(Node node) {

        if(node != null) {
            displayDFSPostOrder(node.getLeft());

            displayDFSPostOrder(node.getRight());

            System.out.print(node.getValue() + " ");
        }
    }

    private void displayBFS(Node node) {
        Node parent;

            queue.add(node);

            while(!queue.isEmpty()) {

                parent = queue.poll();
                System.out.print(parent.getValue() + " ");

                if(parent.getLeft() != null)
                queue.add(parent.getLeft());
                if(parent.getRight() != null)
                queue.add(parent.getRight());
            }
    }

}
