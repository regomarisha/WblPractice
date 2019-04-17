package com.General.main;

/**
 * Program that contains a constructor, a static block and a
 * static method. Execute the program in order to verify the
 * order to execution of methods and block.
 *
 */
public class Employee {
    String name;
    int empId;

    public static double bonus;

    static {
        bonus = 1000;
        System.out.println("This is STATIC BLOCK.");
    }

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
        System.out.println("This is CONSTRUCTOR");
    }

    public static String showMessage() {
        return "STATIC METHOD";
    }

}
