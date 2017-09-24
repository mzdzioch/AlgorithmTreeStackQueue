package com.zdzioch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mzdzioch on 2017-09-24.
 */
public class HeapTest {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>();
        Heap heapImpl = new HeapImpl(array);

        heapImpl.push(1);
        heapImpl.push(9);
        heapImpl.push(4);
        heapImpl.push(7);
        heapImpl.push(3);
        heapImpl.push(5);
        heapImpl.push(6);
        //System.out.println();

        for (Integer integer : array) {
            System.out.print(integer + " ");
        }

        int pop = heapImpl.pop();
        System.out.println("Pop: " + pop  + "     ");

        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
    }
}
