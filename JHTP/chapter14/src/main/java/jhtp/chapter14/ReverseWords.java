package jhtp.chapter14;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the string to be tokenized");
        String text = scanner.nextLine();
        String[] tokens = text.split(" ");

        for (int i = tokens.length - 1; i >= 0; i--) {
            System.out.print(tokens[i]+" ");
        }
        System.out.println();
        scanner.close();
    }
}
