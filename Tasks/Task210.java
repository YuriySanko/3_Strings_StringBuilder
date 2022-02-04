package Strings;

import java.util.Scanner;

public class Task210 {
//    Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или
//    вопросительным знаком. Определить количество предложений в строке X.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        char [] chars= sentence.toCharArray();
        int numberSentence=0;
        for (char ch:chars) {
            if (ch=='.'||ch=='!'||ch=='?') numberSentence++;

        }

        System.out.printf("Number sentence is %d", numberSentence);
    }

}
