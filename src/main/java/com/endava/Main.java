package com.endava;

import static java.lang.System.out;

public class Main {

    private static int add(int first, int second) {
        return first + second;
    }

    private static int subtract(int first, int second) {
        return first - second;
    }

    public static void main(String[] args) {
        out.println("4 + 2 = " + Main.add(4, 2));
        out.println("4 - 2 = " + Main.subtract(4, 2));
    }
}
