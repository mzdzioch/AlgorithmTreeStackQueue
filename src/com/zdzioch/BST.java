package com.zdzioch;

/**
 * Created by mzdzioch on 2017-09-24.
 */
public interface BST {

    void add(Integer value);

    boolean contains(Integer value);

    void print();

    boolean remove(Integer value);

    Node search(Integer value);

    public void preOrder();

    public void inOrder();

    public void postOrder();
}
