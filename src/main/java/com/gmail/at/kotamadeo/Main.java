package com.gmail.at.kotamadeo;

import com.gmail.at.kotamadeo.iterator.Randoms;

public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(40, 100)) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}