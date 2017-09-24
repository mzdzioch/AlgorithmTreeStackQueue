package com.zdzioch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mzdzioch on 2017-09-24.
 */
public class HeapImpl implements Heap {

    private List<Integer> heap;
    private int son;
    private int parent;

    public HeapImpl(List<Integer> heap) {
        this.heap = heap;
    }

    @Override
    public void push(int value) {
        son = heap.size();
        parent = (son - 1) / 2;
        System.out.println();

        heap.add(value);

        while(son > 0 && heap.get(parent) < value) {
            heap.set(son, heap.get(parent));
            son = parent;
            parent = (son - 1) / 2;
            heap.set(son, value);
        }
    }

    @Override
    public int pop() {
        int value = heap.get(heap.size()-1);
        parent = 0;
        son = 1;
        int pop = heap.get(parent);
        heap.set(parent, value);
        heap.remove(heap.size()-1);

        while(son < heap.size()) {

            if(son + 1 < heap.size() && heap.get(son + 1) > heap.get(son)) //jesli prawy syn istnieje i ma wartosc wieksza od lewego to zastepukemy nim lewego
                son++;

            if(value >= heap.get(son))  //jesli warunek kopca spelniony, przerywamy
                break;
            System.out.println("parent: " + parent + " son: " + son);
            if(parent < heap.size()) {
                heap.set(parent, heap.get(son));
            }

            heap.set(son, value);
            parent = son;
            son = 2 * parent + 1;
        }

        return pop;
    }

    @Override
    public int peak() {
        return 0;
    }
}
