package com.example.javamavenjunithelloworld;

public class Utility {

    public static void akash() {
        System.out.println("I am Akash");
    }

    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }
}
