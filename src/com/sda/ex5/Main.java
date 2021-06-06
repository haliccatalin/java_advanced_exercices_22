package com.sda.ex5;

/**
 * Implement the SDAHashSet<E> class that will implement the HashSet<E> logic. It should support methods:
 * • add
 * • remove
 * • size
 * • contains
 * • clear
 */

/**
 * Implement the SDAHashSet<E>class that will implement the HashSet<E> logic.
 * It should support methods:
 * •add
 * •remove
 * •size
 * •contains
 * •clear
 */

public class Main {
    public static void main(String[] args) {
        SDAHashSet <String> sdaHashSet = new SDAHashSet<>();
        sdaHashSet.add("Andreea");
        sdaHashSet.add("Mihai");
        sdaHashSet.add("Mihai");

        System.out.println(sdaHashSet.size());

        sdaHashSet.remove("Mihai");

        System.out.println(sdaHashSet.size());
        if (sdaHashSet.contains("Andreea")){
            System.out.println("sdaHashSet contains true");
        }
    }

}

