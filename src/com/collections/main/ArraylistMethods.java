package com.collections.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/**
 *   Program having different methods to perform below operations.
 *   	---> To create an arraylist and add elements to it.
 *   	---> To search for an element in the list.
 *   	---> To print the elements of the list using iterator.
 *   	---> To print the elements in the reverse order using ListIterator.
 */

public class ArraylistMethods {

    public static String add(ArrayList<String> arrlist,String item){
        if(arrlist.add(item))
            return "Item added";
        return "Error in adding";
    }

    public static ArrayList<String> list(ArrayList<String> arrlist){
        ListIterator<String> iterator=arrlist.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        return arrlist;
    }

    public  static ArrayList<String> listReverse(ArrayList<String> arrayList){
        ArrayList<String> revList=new ArrayList<String>();
        for(int i=arrayList.size()-1;i>=0;i--){
            revList.add(arrayList.get(i));
        }
        return revList;
    }

    public  static String search(ArrayList<String> arrlist,String key){
        for(String name:arrlist){
            if(name.equals(key)){
                return key +" is present in the list";
            }
        }
        return key+" not present in the list";
    }

    public static void main(String[] args) {
        ArrayList<String> arrlist=new ArrayList<String>(Arrays.asList("Jean","Joseph"));
        System.out.println(list(arrlist));

    }
}
