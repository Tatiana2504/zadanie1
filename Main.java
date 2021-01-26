package com.maker;

public class Main {

    public static void main(String[] args) {
        byte x=5;
        byte y1=x++;
        byte y2=x--;
        byte y3=++x;
        byte y4=--x;
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y4);
    }
}
