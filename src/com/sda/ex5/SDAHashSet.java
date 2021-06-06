package com.sda.ex5;


import java.util.ArrayList;
import java.util.List;

//de inlocuit Set cu List
public class SDAHashSet<E> implements HashSet<E> {
    private List<E> itemsList;

    public SDAHashSet() {
        super();
        this.itemsList = new ArrayList<>();
    }

    @Override
    public void add(E item) {
        if (!this.itemsList.contains(item)) {
            this.itemsList.add(item);
        } else {
            //metoda index of ne returneaza pozitia corecta din ista a elementului
            int index = this.itemsList.indexOf(item);
            //metoda set seteaza elementul pe o anumita pozitie
            this.itemsList.set(index, item);
        }
    }

    @Override
    public void remove(E item) {
        this.itemsList.remove(item);
    }

    @Override
    public void clear() {
        this.itemsList.clear();
    }

    @Override
    public int size() {
        return this.itemsList.size();
    }

    @Override
    public boolean contains(E item) {
        return this.itemsList.contains(item);
    }
}

// private Set<E> setItems = new java.util.HashSet<>();

//@Override
//public void add(E item) {
//  setItems.add(item);
//}

// @Override
//public void remove(E item) {
//  setItems.remove(item);
//}

//@Override
//public void clear(E item) {
//  setItems.clear();
//}

// @Override
//public int size(E item) {
//  return 0;
//}

//@Override
//public boolean contains(E item) {
//  return false;
//}

