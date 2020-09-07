package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a[] = {1, 3, 4, 5};
        int sum = 0;
        int i=0;
        for (i=0; i<a.length; i++) {
            sum= sum + a[i];
        }
        System.out.println("sum by for: " +sum);

        sum = 0;
        i=0;
        while (i<a.length) {
            sum= sum + a[i];
            i++;
        }
        System.out.println("sum by while: " +sum);

        sum = 0;
        i=0;
        do {
            sum = sum + a[i];
            i++;
        } while (i<a.length);
        System.out.println("sum by do while: " +sum);

	Scanner scan = new Scanner(System.in);
    }
}
