package org.bridgelabz;

import java.util.Scanner;

/* Java program to check for a leap year */
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year = input.nextInt();
        String n = String.valueOf(year);
        int flag = 0;

        if (n.length() == 4) {  //the length must be of 4 digits.
            if (year % 400 == 0) {  // If a year is multiple of 400 then it is a leap year
                flag = 1;
            } else if (year % 100 == 0) {  // Else If a year is multiple of 100,then it is not a leap year
                flag = 0;
            } else if (year % 4 == 0) {  // Else If a year is multiple of 4,then it is a leap year
                flag = 1;
            } else {
                flag = 0;
            }
            if (flag == 1) {  //if flag value is 1 then leap year,if flag value is 0 then not a leap year
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("wrong input !!!");
        }
    }
}