package Strings;

import java.util.Scanner;
public class Task26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        char [] chars= sentence.toCharArray();

        StringBuilder newSentence= new StringBuilder();
        for (char ch:chars) {
            newSentence.append(ch);
            newSentence.append(ch);
        }

        System.out.println(newSentence);
    }
}
