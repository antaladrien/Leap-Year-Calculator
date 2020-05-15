package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter year: ");
        int num = myObj.nextInt();

        System.out.println(isLeapYear(num));
    }

    public static boolean isLeapYear(int year) {
        if (year<1 || year>9999) {
            return false;
        } else if (year % 4 != 0) {
            return false;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
            return false;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return true;
        }
    }
}
