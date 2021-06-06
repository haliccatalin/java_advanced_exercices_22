package com.sda.ex6;

import java.util.Map;
import java.util.TreeMap;

/**
 * Create a method that accepts
 * TreeMap and prints the first and last EntrySet in the console.
 */
public class Main {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Moto","Honda");
        treeMap.put("Auto","Audi");
        treeMap.put("Race","BMW");

        printTreeMap(treeMap);
    }

    public static void printTreeMap(TreeMap<String, String> treeMap) {
        Map.Entry<String, String> firstEntry = treeMap.firstEntry();
        System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());

        Map.Entry<String, String> lastEntry = treeMap.lastEntry();
        System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());

    }
}
