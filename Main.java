package com.maker;

public class Main {

    public static void main(String[] args) {
        double d = 1e-305 * Math.PI;
        System.out.print(d);
        for (int i = 0; i < 4; i++)
            System.out.print(d /= 100000);
    }
}
