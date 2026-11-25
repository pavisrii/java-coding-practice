package main.basicprograms;
import java.util.Scanner;
public class oddeven {
        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter no : ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

            sc.close();
        }
    }

