package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int h_count = 0;
        int t_count = 0;
        int count = 1;
        double random;
        System.out.println("Flip A Coin No.of Times : " + h_count);
        Scanner scanner = new Scanner(System.in);
        int flips = scanner.nextInt();
        while (count <= flips) {
            random = Math.random();
            if (random < 0.5) {
                h_count++;
                System.out.println("Heads");
            } else {
                t_count++;
                System.out.println("Tails");
            }
            count++;
        }
        System.out.println("Number of Heads : " + h_count);
        System.out.println("Number of Tails : " + t_count);

        double a = h_count / (double) flips * 100;
        double b = t_count / (double) flips * 100;
        System.out.println("Head Percentage " + a + " %");
        System.out.println("Tail Percentage " + b + " %");
    }
}
