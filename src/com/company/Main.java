package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a[] = {1, 3, 4, 5};
        int sum = 0;
        for (int i=0; i<a.length; i++) {
            sum= sum + a[i];
        }
        System.out.println("sum by for: " +sum);
	Scanner scan = new Scanner(System.in);
    }
}
