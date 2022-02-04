package Strings;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        char [] chars= sentence.toCharArray();
        int count=0;
        for (char ch:chars) {
            if (Character.isDigit(ch)) count++;
        }

        System.out.println(count);
    }

}
