package main.basicprograms;
import java.util.Scanner;
    public class palindrome {
        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("NUM: ");
            int num = sc.nextInt();
            int on = num;
            int rem = Math.abs(num);
            int rev = 0;
            while (rem > 0) {
                int digit = rem % 10;
                rev = rev * 10 + digit;
                rem = rem / 10;
            }
            if (num >= 0 && on == rev) {
                System.out.println(num + " is a palindrome.");
            } else {
                System.out.println(num + " is not a palindrome.");
            }
            sc.close();
        }}

