package com.company;

public class Main {

    public static void main(String[] args) {
        ResizeableArray arr = new ResizeableArray(2);
        arr.insert(10);
        arr.insert(10);
        arr.insert(10);
        arr.insert(10);

        System.out.println(arr);
    }
}
