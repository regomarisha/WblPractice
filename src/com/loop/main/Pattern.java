package com.loop.main;

/*
Program  that prints a pattern like below.
    		*
    		**
    		***
    		****
    		*****
    		******
 */
public class Pattern {

    public static String draw(int number){
        if(number<=0)return "Cannot draw pattern for numbers less than or equal to 0";
        for(int i=1;i<=number;i++){
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return "Success";
    }
    public static void main(String[] args) {

        System.out.print(draw(2));
    }
}
