package Strings;

import java.util.Scanner;

    public class Task22 { // В строке вставить после каждого символа 'a' символ 'b'.
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String sentence = scan.nextLine();
            char [] chars= sentence.toCharArray();
            StringBuilder newSentence= new StringBuilder();

            for (int i=0; i<chars.length;i++) {
                newSentence.append(chars[i]);
                if (chars[i] =='a') {
                    newSentence.append('b');
                }
            }

            System.out.println(newSentence);
        }
}
