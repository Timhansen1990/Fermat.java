package com.company.Chapter5;

import java.util.Scanner;

public class exercise6 {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int n = 2;

        System.out.print("What is a: ");
        int a = userInput.nextInt();
        System.out.print("What is b: ");
        int b = userInput.nextInt();
        System.out.print("What is c: ");
        int c = userInput.nextInt();

        double result = - b * Math.sqrt(Math.pow(b, n) - 4 * ( a * b)/ (2 * a));
        System.out.println(result);

        // i found that my results is negative and it is possible because of b can be larger than the squareroot but i still need to find the bug
        // so i can print out only a positive square root.
    }
}
