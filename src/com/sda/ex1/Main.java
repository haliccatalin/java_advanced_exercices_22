package com.sda.ex1;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a method that takes a string list as a parameter,
 * then returns the list sorted alphabetically from Z to A.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a method that takes a string list as a parameter ,
 * then returns the list sorted alphabetically from Z to A.
 */
public class Main {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("petrica");
        nameList.add("Laurentiu");
        nameList.add("Terhes");

        List<String> reversedOrderNamesList = sortNamesReversedAlphabetically(nameList);
        System.out.println("Lista sortata invers alfabetic");
        reversedOrderNamesList.stream().forEach((String name) -> System.out.println(name));

        System.out.println("\nLista initiala");

        nameList.stream().forEach((String name) -> System.out.println(name));
    }

    public static List<String> sortNamesReversedAlphabetically(List<String> names) {
        return names.stream()
                .sorted(Comparator.comparing(String::toString).reversed())
                .collect(Collectors.toList());

    }
}

