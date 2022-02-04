package Strings;

import java.util.Scanner;
public class Task26 {
//    Из заданной строки получить новую, повторив каждый символ дважды.

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
