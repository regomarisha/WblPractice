package com.array.main;

/**
 * Class contains function to find the common number
 * in any given two arrays.
 */
public class Common {
    public static String findCommon(int[] arr1, int[] arr2) {
        String common="";
        outer:for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    //System.out.println("" + arr1[i]);
                    String sub=" "+arr1[i];
                     if(!common.contains(sub))
                        common=common+" "+arr1[i];
                        break ;
                }
            }
        }
        return common;
    }

    public static void main(String[] args) {
        int[] arr1={1,3,7,2,4,6,7,7};
        int[] arr2={2,5,9,0,2,7,3,2,2,2,2};
        String str=findCommon(arr1,arr2);
        System.out.println(str);
    }


}
