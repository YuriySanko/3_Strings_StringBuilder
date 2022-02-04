package Strings;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        char [] chars= sentence.toCharArray();
        int count=0;
        for (int i=0; i<chars.length;i++) {
            if (Character.isDigit(chars[i])) {
                count++;
                i++;
                while (i<chars.length&&Character.isDigit(chars[i])) i++;
            }
        }

        System.out.println(count);
    }
}
