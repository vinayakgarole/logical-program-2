package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        n = sc.nextInt();

        for (int i=1; i<n; i++) {

            if (n%i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}
