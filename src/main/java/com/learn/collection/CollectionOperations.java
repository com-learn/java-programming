package com.learn.collection;

import java.util.*;

public class CollectionOperations {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("abcd","bcde","cdefg", "ef","fg"));
        // Collections sort
        Collections.sort(list); // natural Order
        //Collections.sort(list, Comparator.comparing(String::length)); // custom Order
        list.forEach(System.out::println);

        int index = Collections.binarySearch(list, "ef");
        System.out.println(" ef is present at location "+ index);

        Collections.shuffle(list);

        System.out.println(list);

        int index2 = Collections.binarySearch(list, "fg");
        System.out.println(" after shuffling, fg is present at location "+ index2);

        Collections.reverse(list);
        System.out.println(" after reversing list "+ list);

        Collections.rotate(list, 2);
        System.out.println(" after rotating list "+ list);


    }
}
