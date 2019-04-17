package com.file.main;

import java.io.*;
import java.util.Scanner;
import java.io.Console;

/**
 *  Write a program that takes input from user dynamically using below classes.
 *   --> Scanner: Use this class to input 2 integer numbers and sum them.
 *   --> BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
 *   --> DatainputStream: Use this class to input 2 integer numbers and multiply them.
 *   --> Console: Use this class to input 2 integer numbers and divide them.
 */

//Class does not contain a separate test class

public class UserInput {
    public static int scannerInput(int num1,int num2)
    {
         return num1+num2;
    }

    public static int inpuRreaderInput(int num1,int num2)
    {
        return num1-num2;
    }

    public static int dataInputStream(int num1,int num2){
        return num1*num2;
    }

    public  static int console(int num1,int num2)  {
        return num1/num2;
    }


    public static void main(String args[]) throws IOException ,NullPointerException {

        //Scanner: Use this class to input 2 integer numbers and sum them.
        System.out.println("Reading input using Scanner class");
        System.out.println("Enter input1 and input2");
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Scanner Class");
        System.out.println("Input 1 : "+num1);
        System.out.println("Input 2 : "+num2);
        System.out.println("Output  : "+UserInput.scannerInput(num1,num2));


        System.out.println("Reading input using InputReader and BufferReader class");
        System.out.println("Enter input3 and input4");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int num3=Integer.parseInt(bf.readLine());
        int num4=Integer.parseInt(bf.readLine());
        System.out.println("InputSTeamReader and BufferReader Class");
        System.out.println("Input 3 : "+num3);
        System.out.println("Input 4 : "+num4);
        System.out.println("Output  : "+UserInput.inpuRreaderInput(num3,num4));

        System.out.println("Reading input using DatainputStream class");
        System.out.println("Enter input5 and input6");
        DataInputStream dis=new DataInputStream(System.in);
        int num5=Integer.parseInt(dis.readLine());
        int num6=Integer.parseInt(dis.readLine());
        System.out.println("Input 5 : "+num5);
        System.out.println("Input 6 : "+num6);
        System.out.println("Output  : "+UserInput.dataInputStream(num5,num6));

        //The console reference stores null Causing nullpointer exception
        //COuldnt implement this
       /* System.out.println("Reading input using Console class");
        System.out.println("Enter input7 and input8");
        Console c = System.console();
        int num7=Integer.parseInt(c.readLine());
        int num8=Integer.parseInt(c.readLine());
        System.out.println("Input 7 : "+num7);
        System.out.println("Input 8 : "+num8);
        System.out.println("Output  : "+UserInput.console(num7,num8));
    */
    }

}

