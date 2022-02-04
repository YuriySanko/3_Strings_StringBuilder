package Strings;

import java.util.Scanner;

public class Task11 {
    public static String snake_case (String words){
        char [] camel = words.toCharArray();
        String snake=new String();
        for (int i=0; i<camel.length;i++) {
            if (Character.isUpperCase(camel[i])){
                snake+='_';
                snake+=Character.toLowerCase(camel[i]);
            }
            else {
                snake+=camel[i];

            }
        }

        return snake;
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input number of variable: ");
        int number = scan.nextInt();
        String [] camelCase= new String[number];
        System.out.println("Write "+number+ " camelCase words: ");
        for (int i=0;i<number;i++){
            camelCase [i]= scan.next();
        }
        for (String words: camelCase){
            System.out.println(snake_case(words));
        }



    }
}
