package Strings;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        System.out.println(sentence.replace("word","letter"));
    }
}
