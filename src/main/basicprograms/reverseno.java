package main.basicprograms;
  
import java.util.Scanner;

public class reverseno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rem = Math.abs(num);
        int rev = 0;

        while (rem > 0) {
            int digit = rem % 10;
            rev = rev * 10 + digit;
            rem = rem / 10;
        }

        if (num < 0) {
            rev = -rev;
        }

        System.out.println("Reversed number: " + rev);

        sc.close();
    }
}
