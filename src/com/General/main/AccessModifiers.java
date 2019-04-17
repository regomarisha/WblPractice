package com.General.main;

/**
 * Program that implements various functions of different type of
 * access modifiers(private,protected,default,public)
 * and then access these methods with in or outside the class
 * based on the identifier scope.
 */
public class AccessModifiers {
    private String privateVariable="Private";
    protected String protectVariable="Protected";
    String defaultVariable="Default";
    public String publicVariable="Public";

    private String privateFunction(){
        return privateVariable;
    }

    public String defaultFunction(){
        return defaultVariable;
    }
}
