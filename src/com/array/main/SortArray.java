package com.array.main;

/**
 * Class contains function to sort an array.
 */
public class SortArray {
    public static int[] sort(int[] a){
        int len=a.length;
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int arr[]={5,4,3,12,12,0};
        int[] arrResult=sort(arr);
        for(int i=0;i<arrResult.length;i++) {
            System.out.println(arrResult[i]);
        }
    }
}
