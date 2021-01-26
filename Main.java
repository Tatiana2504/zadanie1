package com.maker;

public class Main {

    public static void main(String[] args) {
        System.out.print(1e-40f/1e10f);
        System.out.print(-1e-300/1e100);
        float f=1e-6f;
        System.out.print(f);
        f+=0.002f;
        System.out.print(f);
        f+=3;
        System.out.print(f);
        f+=4000;
        System.out.print(f);
    }
}
