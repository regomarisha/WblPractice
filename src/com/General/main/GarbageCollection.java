package com.General.main;

/**
 * Program implementing explicit garbage collection.
 *
 */
//No separate test class is written for this

public class GarbageCollection {
    public void finalize(){
        System.out.println("Finalize method is called by garbage collection" +
                " thread before collecting object. " +
                "Its the last chance for any object to perform cleanup utility.");}
    public static void main(String args[]){
        GarbageCollection garbage = new GarbageCollection();
        garbage=null;
        System.gc();
    }
}
