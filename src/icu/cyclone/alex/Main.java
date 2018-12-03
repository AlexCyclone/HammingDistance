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
        int h = 0;
        while (a != 0 || b != 0) {
            h += a%2 == 0 ^ b%2 == 0 ? 1 : 0;
            a >>= 1;
            b >>= 1;
        }
        return h;
    }
}
