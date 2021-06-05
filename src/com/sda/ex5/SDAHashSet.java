package com.sda.ex5;

import java.util.Set;

public class SDAHashSet <E> implements HashSet <E> {

    private Set<E> sdaSet = new java.util.HashSet<E>();

    @Override
    public void add(E item) {
        sdaSet.add(item);
    }

    @Override
    public void remove(E item) {
        sdaSet.remove(item);
    }

    @Override
    public int size(E item) {
        return sdaSet.size();
    }

    @Override
    public boolean contains(E item) {
        return sdaSet.contains(item);
    }

    @Override
    public void clear(E item) {
        sdaSet.clear();
    }
}
