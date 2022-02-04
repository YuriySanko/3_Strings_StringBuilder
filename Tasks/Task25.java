package Strings;

import java.util.Scanner;

public class Task25 {
//    Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        char [] chars= sentence.toCharArray();
        int count=0;
        for (char ch:chars) {
            if (ch=='a') count++;
        }

        System.out.println(count);
    }

}
