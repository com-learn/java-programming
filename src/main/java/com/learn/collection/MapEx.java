package com.learn.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapEx {

    // Map is an association between two fields or combination of two fields
    // Key should be unique, can contain only one null
    // Value are non unique , can be null
    // since keys are unique - keySet
    // since keys are unique, combination of key and value will be unique - EntrySet
    // since values are not unique - Collection values()

    public static void main(String[] args) {

        Map<String, String> nameLocationMap = new LinkedHashMap<>(); // HashMap<>();
        nameLocationMap.put("messi","argentina");
        nameLocationMap.put("ronaldo", "portugal");
        nameLocationMap.put("mbappe", "france");
        nameLocationMap.put("neymar", "brazil");

        nameLocationMap.forEach((key, value) -> System.out.println(key + "=" + value));
        // basic operations - get, getOrDefault,
        //                  - containsKey, containsValue
        //                  - put, putIfAbsent
        //                  - remove(key), remove(key,value)
        //                  - size(), isEmpty
        //                  - replace(key, currentValue, newValue)
        // bulk operations
        //                  - clear
        //                  - putAll(newMap)
        //                  - replaceAll((key,currentValue)-> newValue)
        // view operations  - keySet, entrySet, values

    }
}
