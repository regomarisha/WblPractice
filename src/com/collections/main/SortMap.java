package com.collections.main;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

/*
   Program to sort a map by value.
 */
public class SortMap {
    public static Map<String,Integer> sortAscending(Map<String,Integer> map) {
        Map<String, Integer> sorted = map.entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                                LinkedHashMap::new));

        System.out.println("map after sorting by values: " + sorted);
        // above code can be cleaned a bit by using method reference
        return sorted;
    }
    public static Map<String,Integer> sortDescending(Map<String, Integer> map){
        Map<String, Integer> sorted =map
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));
            System.out.println("map after sorting by values in descending order: "
                + sorted);

        return  sorted;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("b", 70);
        map.put("a", 30);
        map.put("c", 10);
        map.put("d", 40);
        map.put("e", 20);
        sortAscending(map);
        //sortDescending(hmap);

    }

}
