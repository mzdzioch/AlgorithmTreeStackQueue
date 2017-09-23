package com.zdzioch;

public class Main {

    public static void main(String[] args) {

        int[][] tab = new int[7][3];

        for(int i = 0; i < 7; i++) {
            tab[i][0] = i;
        }

        tab[0][1] = 1;
        tab[0][2] = 2;

        tab[1][1] = 3;
        tab[1][2] = 4;

        tab[2][1] = 5;
        tab[2][2] = 6;

        Tree tree = new Tree(tab);

//        System.out.print("Pre order ");
//        tree.preOrder();
//        System.out.print("In order: ");
//        tree.inOrder();
//        System.out.print("Post order: ");
//        tree.postOrder();
        System.out.print("BFS: ");
        tree.treeBFS();

    }
}
