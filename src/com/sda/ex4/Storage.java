package com.sda.ex4;

import java.util.*;

public class Storage {
    private HashMap<String, List<String>> storageHashMap;

    public Storage() {
        this.storageHashMap = new HashMap<>();


    }

    public void addToStorage(String key, String value) {

        List<String> valuesList;
        if (this.storageHashMap.containsKey(key)) {
            valuesList = this.storageHashMap.get(key);
            valuesList.add(value);
        } else {
            valuesList = new LinkedList<>();
            valuesList.add(value);
        }
        this.storageHashMap.put(key, valuesList);
    }

    public void printValues(String key) {
        System.out.println(this.storageHashMap.get(key));
    }

    public void findValues(String value) {
        for (Map.Entry<String, List<String>> entry : this.storageHashMap.entrySet()) {
            for (String item : entry.getValue()) {
                if (item.equals(value)) {
                    System.out.println(entry.getKey());
                }
            }

        }
    }

    public void printStorage() {
        for (Map.Entry<String, List<String>> entry : this.storageHashMap.entrySet()) {
            System.out.println(entry.getKey());
            for (String item : entry.getValue()) {

                System.out.println(" - " + item);

            }

        }
    }

}
