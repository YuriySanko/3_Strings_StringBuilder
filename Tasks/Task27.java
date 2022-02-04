package Strings;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        char [] chars= sentence.toCharArray();
        StringBuilder newSentence= new StringBuilder();
        for (char ch:chars) {
            if (ch!=' '&&newSentence.indexOf(String.valueOf(ch))==-1) {
                newSentence.append(ch);
            }
        }

        System.out.println(newSentence);
    }
}
