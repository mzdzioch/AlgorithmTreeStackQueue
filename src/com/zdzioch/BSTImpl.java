package com.zdzioch;

import jpcap.packet.Packet;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by mzdzioch on 2017-09-24.
 */
public class BSTImpl implements BST {

    private Node root;
    private Queue<Node> queue = new LinkedList<>();

    public Node search(Integer value) {
        Node e = root;

        while(e != null && e.getValue() != value) {

            if(value < e.getValue()) {
                e = e.getLeft();
            } else {
                e = e.getRight();
            }
        }

        return e;
    }


    @Override
    public void add(Integer value) {

        Node e = root;

        if(e == null) root = new Node(value);
        else {
            while(e != null) {

                if(e.getValue() > value && e.getLeft() == null) {
                    e.setLeft(new Node(value));
                    return;
                } else if(e.getValue() < value && e.getRight() == null) {
                    e.setRight(new Node(value));
                    return;
                } else if(e.getValue() > value) {
                    e = e.getLeft() ;
                } else if(e.getValue() < value) {
                    e = e.getRight();
                } else {
                    return;
                }
            }
// Version 2
//            while(e != null) {
//
//                if(e.getValue() > value) {
//                    if(e.getLeft() == null) {
//                        e.setLeft(new Node(value));
//                        return;
//                    } else e = e.getLeft() ;

//                } else if(e.getValue() < value) {
//                    if(e.getRight() == null) {
//                        e.setRight(new Node(value));
//                        return;
//                    } else e = e.getRight();
//                }
//            }
        }
    }

    @Override
    public boolean contains(Integer value) {

        Node e = root;

        while(e != null && e.getValue() != value) {

            if(value < e.getValue()) {
                e = e.getLeft();
                if(e != null && e.getValue() == value) return true;
            } else {
                e = e.getRight();
                if(e != null && e.getValue() == value) return true;
            }
        }

        return false;
    }

    @Override
    public void print() {

    }

    @Override
    public boolean remove(Integer value) {
        return false;
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
