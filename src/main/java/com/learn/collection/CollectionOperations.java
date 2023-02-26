package com.learn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionOperations {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("abcd","bcde","cdefg", "ef","fg"));
        // Collections sort
        Collections.sort(list); // natural Order
        //Collections.sort(list, Comparator.comparing(String::length)); // custom Order
        list.forEach(System.out::println);

    }
}
