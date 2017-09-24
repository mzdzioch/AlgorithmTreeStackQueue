package com.zdzioch;

/**
 * Created by mzdzioch on 2017-09-24.
 */
public class BSTTest {

    public static void main(String[] args) {

        BSTImpl bst = new BSTImpl();

        bst.add(5);
        bst.add(7);
        bst.add(9);
        bst.add(3);
        bst.add(4);
        bst.add(4);

        Node e = bst.search(3);
        System.out.println(e.getValue());
        bst.preOrder();
        System.out.println(bst.contains(10));

    }
}
