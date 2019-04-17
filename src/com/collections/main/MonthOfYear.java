package com.collections.main;

/*
 Program that defines an enum having months of the year and
 then prints the value of all the enum elements.
 */
public class MonthOfYear {
    public enum Month
    {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static int getTotalMonth(){
       return Month.values().length;
    }

    public static String print(){
        String str="";
        for (Month mon:Month.values()) {
            System.out.println(mon);
            str=str+mon+" ";

        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println("Total number of months are : "+getTotalMonth());
        System.out.println(print());
    }
}
