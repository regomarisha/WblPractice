package com.collections.main;

import java.util.HashMap;
import java.util.Map;

/*
  	Program having below methods.
		--> To create a hashmap.
        --> To search for a key in the created map
             and then returns its value.

 */
public class HashMapMethod {
    public static HashMap<Integer,String> create(){
        HashMap<Integer,String> hsh=new HashMap<Integer, String>();
        return hsh;
    }

    public static HashMap<Integer,String> add(HashMap<Integer,String> hmap,Integer itg,String str){
        hmap.put(itg,str);
        if(hmap.containsKey(itg) && (hmap.get(itg) == str))
            System.out.println("Item added");
        else
            System.out.println("Error in adding");
        return hmap;
    }

    public static String search(HashMap<Integer,String> hmap,Integer key){
        if(hmap.containsKey(key))
            return hmap.get(key);
        return "Key not found";
    }

    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<Integer, String>();
        System.out.println(add(map,1,"Henry"));
        for (Integer name: map.keySet()){
            Integer key = name.intValue();
            String value = map.get(name).toString();
            System.out.println(key + " " + value);
        }



    }
}
