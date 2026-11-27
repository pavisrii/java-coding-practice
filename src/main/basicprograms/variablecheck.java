
import java.util.Scanner;
    public class indexcheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String str = sc.nextLine();

            System.out.print("Enter the character to search: ");
            char ch = sc.next().charAt(0);

            boolean found = false;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch) {
                    System.out.println("Found at index: " + i);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Character not found.");
            }

            sc.close();}}
