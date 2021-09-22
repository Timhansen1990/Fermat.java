package com.company.Chapter5;

import java.util.Scanner;

public class exercise7 {

    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        int n = 2;

        System.out.print("What is a: ");
        int a = numberInput.nextInt();
        System.out.print("What is b: ");
        int b = numberInput.nextInt();
        System.out.print("What is c: ");
        int c = numberInput.nextInt();

        boolean scenario1 = a > b + c;
        boolean scenario2 = b > a + c;
        boolean scenario3 = c > a + b;
        if (scenario1 || scenario2 || scenario3) {
            System.out.println("Cannot form a triangle");
        }
        else
            System.out.println("The triangle is possible!");
    }
}