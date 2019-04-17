package com.collections.main;

import java.util.ArrayList;
import java.util.Arrays;

/*
*  	Program which takes input series as a1,a2,a3....an,b1,b2,b3...bn
*  and produces output as a1,b1,a2,b2,a3,b3.......,an,bn.
*/
//If array size is odd the last item retains its position.

public class A1B1Ouput {
    public static  ArrayList<Integer> swap(int[] a){
        ArrayList<Integer> ar = new ArrayList<Integer>();

        int y=(a.length/2);

        int[] newArray1 = Arrays.copyOfRange(a, 0, (a.length/2));
        int[] newArray2 = Arrays.copyOfRange(a, (a.length/2), a.length);

        for(int i=0;i<y;i++){
            ar.add(newArray1[i]);
            ar.add(newArray2[i]);
        }

        if(a.length%2!=0){
            ar.add(a[a.length-1]);
        }

        return ar;
    }

    public static void main(String[] args){
        //int[] a = {1,2,3,4,5,6,7,8,9};
        int[] a = {1,2};
        ArrayList<Integer> al=swap(a);
        System.out.println(al);
    }
}

