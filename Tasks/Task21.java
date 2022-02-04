package Strings;

import java.util.Scanner;

public class Task21 {  // Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        char [] chars= sentence.toCharArray();
        int count=0;
        int maxSpace=0;
        for (int i=0; i<chars.length;i++) {
            while (i<chars.length&&Character.isSpaceChar(chars[i])) {
                count++;
                i++;
            }
            if (count>maxSpace) {
                maxSpace=count;
            }
            count=0;
        }

        System.out.println(maxSpace);
    }
}
