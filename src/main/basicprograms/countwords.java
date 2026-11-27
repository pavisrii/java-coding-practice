package main.basicprograms;
import java.util.Scanner;
public class countwords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Sentence: ");
        String str = sc.nextLine().trim();

        int count = 0;

        if (!str.isEmpty()) {
            String[] words = str.split("\\s+");
            count = words.length;
        }

        System.out.println("Words: " + count);

        sc.close();
    }
}

