package Strings;

import java.util.Scanner;

//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

public class Task210 {
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
