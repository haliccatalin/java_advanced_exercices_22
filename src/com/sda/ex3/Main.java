package com.sda.ex3;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a method that takes the map as a parameter,
 * where the key is string and the value number,
 * and then  prints each map element to the console in the format:
 * Key: <k>, Value: <v>.
 * There should be a comma at the end of every line except the last,
 * and a period at the last.
 *
 * Example:
 * Key: Java, Value: 18,
 * Key: Python, Value: 1,
 * …
 * Key: PHP, Value: 0.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mapItems = new HashMap<>();
        mapItems.put("Java", 18);
        mapItems.put("Python", 1);
        mapItems.put("PHP", 0);

        printMapElements(mapItems);
    }

    public static void printMapElements(Map<String, Integer> mapItems) {
        int counter = 1;
        for (Map.Entry<String, Integer> item : mapItems.entrySet()) {
            System.out.print("Key: " + item.getKey() + ", Value: " + item.getValue());
            if (counter == mapItems.size()) {
                System.out.print(".");
            } else {
                System.out.print(", \n");
            }
            counter++;
        }
    }
}
