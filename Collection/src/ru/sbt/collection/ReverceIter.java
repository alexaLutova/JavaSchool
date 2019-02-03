package ru.sbt.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ReverceIter implements Iterator<ArrayList> {

    private ArrayList list;
    private int position;
    private int last = -1;

    public int getPosition() {
        return position;
    }

    public ReverceIter(ArrayList list) {
        this.list = list;
        this.position = list.size();
    }

    @Override
    public boolean hasNext() {
        return position > 0;
    }

    @Override
    public  ArrayList next() {
        int i = position;
        position = i - 1;
        last = i;
        return list;
    }
}
