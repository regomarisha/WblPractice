package com.General.main;

/**
 *   Immutable class.
 */
public final class Account {
    final String name;
    final int accno;
    public Account(String name,int accno){
        this.accno=accno;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getAccno(){
        return accno;
    }
}
