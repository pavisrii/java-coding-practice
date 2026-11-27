package main.basicprograms;

import java.util.Scanner;

public class digitcount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int n = sc.nextInt();

        int num = Math.abs(n);
        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                count++;
                num = num / 10;
            }
        }

        System.out.println("Digits: " + count);

        sc.close();
    }
}
