package com.stringcomputation.main;

/**
 * Program to implement hashCode() and equals() methods.
 */

public class HashcodeAndEquals {
    private int serial;
    private String fname;
    private String lname;

    public HashcodeAndEquals(int serial, String fname, String lname){
        this.serial=serial;
        this.fname=fname;
        this.lname=lname;
    }

    @Override
    public int hashCode() {
        return this.serial;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(obj==null||getClass()!=obj.getClass())
            return false;

        HashcodeAndEquals hceq=(HashcodeAndEquals) obj;
        return (hceq.serial==this.serial && hceq.fname==this.fname && hceq.lname==this.lname);

    }

    public static String compare(Object g1,Object g2){
        // comparing above created Objects.
        if(g1.hashCode() == g2.hashCode())
        {
            if(g1.equals(g2))
                return "Both Objects are equal. ";
            else
                return "Both Objects are not equal. ";

        }
        else
            return "Both Objects are not equal. ";
    }


    public static void main(String args[])
    {
        System.out.println((new HashcodeAndEquals(1,"Priya", "Rego")).hashCode());
        System.out.println(new HashcodeAndEquals(120,"Homeri", "go")
               .equals(new HashcodeAndEquals(120,"Homer", "go")));
    }

}

