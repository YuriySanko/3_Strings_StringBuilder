package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        char [] chars= sentence.trim().toCharArray();
        StringBuilder newSentence= new StringBuilder();

        for (int i=0; i<chars.length;i++) {
            newSentence.append(chars[i]);
            if (chars[i] ==' ') {
                while (chars[++i]==' '){

                }
                i--;
            }
        }

        System.out.println(newSentence);
    }

}
