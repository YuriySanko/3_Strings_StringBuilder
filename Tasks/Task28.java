package Strings;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
//        Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
//         Случай, когда самых длинных слов может быть несколько, не обрабатывать.

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String [] words= sentence.trim().split(" ");
        int maxLengthWord=0;
        int indexMaxWord=0;
        for (int i = 0; i < words.length; i++) {
            if (maxLengthWord < words[i].length()) {
                maxLengthWord = words[i].length();
                indexMaxWord = i;
            }
        }
        int countMaxWords=0;
        for (String word:words){
            if (word.length()==words[indexMaxWord].length())
                countMaxWords++;
        }

        if (countMaxWords<2)
            System.out.println(words[indexMaxWord]);

    }
}
