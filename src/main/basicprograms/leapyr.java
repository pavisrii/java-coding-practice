package main.basicprograms;

import java.util.Scanner;

public class leapyr {
        static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a year: ");
            int yr = input.nextInt();

            boolean isLeapYear = (yr % 400 == 0)
                    || (yr % 4 == 0 && yr % 100 != 0);

            if (isLeapYear) {
                System.out.println(yr + " is a leap yr.");
            }
            else {
                System.out.println(yr + " is not a leap yr.");
            }
            input.close();
        }
    }