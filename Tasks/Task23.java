package Strings;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        char [] chars= sentence.toCharArray();
        int count=0;

        for (int i=0; i<chars.length/2;i++) {
            if (chars[i] ==chars[chars.length-i-1]) {
                count++;
            }
        }
        if (count==chars.length/2)
            System.out.printf("The word %s is a palindrome",sentence);
        else
            System.out.printf("The word %s isn't a palindrome",sentence);
    }
}
