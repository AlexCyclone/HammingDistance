package icu.cyclone.alex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = sc.nextInt();
        System.out.print("Input b: ");
        int b = sc.nextInt();

        System.out.println("H = " + hammingDistance(a, b));
    }

    private static int hammingDistance(int a, int b) {
        if ((a < 0) || (b < 0)) {
            throw new IllegalArgumentException("Digit must be positive integer");
        }

        int distance = 0;
        a ^= b;

        while (a > 0) {
            distance += a & 1;
            a >>= 1;
        }
        return distance;
    }
}
