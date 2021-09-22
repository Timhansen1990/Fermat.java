package com.company.Chapter5;

import java.util.Scanner;

public class exercise3 {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        // Import statement
        System.out.print("Give me a value for n: ");

        // Variables
        int a = 5;
        int b = 7;
        int c = 4;
        int n = userInput.nextInt();
        if (n > 2 && (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n))){
            System.out.println("Holy smokes, Fermat is wrong!");
        }
        else
            System.out.println("No, doesn't work");



    }
}
