package Strings;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
//       Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
//       Учитывать только английские буквы.

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        char [] chars= sentence.toCharArray();
        int countUppCase=0;
        int countLowCase=0;
        for (char ch:chars) {
            if (ch>='a'&&ch<='z') countLowCase++;
            else
                if (ch>='A'&&ch<='Z') countUppCase++;
        }

        System.out.printf("Number chars in Upper Case is %d in Low Case is %d", countUppCase,countLowCase);
    }
}
