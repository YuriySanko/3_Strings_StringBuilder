package Strings;

//  Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции:
//   отсортировать абзацы по количеству предложений;
//   в каждом предложении отсортировать слова по длине;
//   отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task31 {
    static String text = "The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class. \n" +
            "The Java language provides special support for the string concatenation operator ( + ), and for conversion of other objects to strings. String concatenation is implemented through the StringBuilder(or StringBuffer) class and its append method. String conversions are implemented through the method toString, defined by Object and inherited by all classes in Java. For additional information on string concatenation and conversion, see Gosling, Joy, and Steele, The Java Language Specification. \n" +
            "Unless otherwise noted, passing a null argument to a constructor or method in this class will cause a NullPointerException to be thrown. \n" +
            "A String represents a string in the UTF-16 format in which supplementary characters are represented by surrogate pairs (see the section Unicode Character Representations in the Character class for more information). Index values refer to char code units, so a supplementary character uses two positions in a String. \n" +
            "The String class provides methods for dealing with Unicode code points (i.e., characters), in addition to those for dealing with Unicode code units (i.e., char values). ";


    public static int choice(){
        System.out.println("\nChoice an action to make operation with text from 1 - 3: ");
        System.out.println("1 - sorting paragraphs by the number of sentences ");
        System.out.println("2 - every sentence sort by the length of words ");
        System.out.println("3 - sorting lexemes ");
        System.out.println("0 - EXIT");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;
    }

    public static void sortingParagraphs(){
        String [] paragraphs= text.split("\n");  // splitting paragraphs


        // splitting and counting sentences in every paragraph
        int [] countSentence= new int[paragraphs.length];
        int maxCountSentence=0;
        for (int i=0;i<paragraphs.length;i++) {
            countSentence [i]=0;
            Pattern p= Pattern.compile("[A-ZА-Я]*[.!?]+\\s");
            Matcher m = p.matcher(paragraphs[i]);
            while (m.find()){
                countSentence [i]++;
            }
            if (maxCountSentence<countSentence[i]) {
                maxCountSentence = countSentence[i];
            }
            System.out.println(countSentence[i]);
        }

        // print sorting paragraphs
        for (int i=1; i<=maxCountSentence;i++) {
            for (int j=0; j< paragraphs.length;j++) {
                if (countSentence[j]==i){
                    System.out.println(paragraphs[j]);
                }
            }
        }

    }

    public static void sortingSentences(){
        String [] paragraphs= text.split("\n");  // splitting paragraphs

        for (String paragraph:paragraphs) {
            Pattern s= Pattern.compile("[A-ZА-Я]*[.!?]+\\s");// splitting sentences
            String []sentences =s.split(paragraph);


            for (String sentence:sentences) {                // sorting words by length in every sentence
                Pattern w= Pattern.compile("\\W+");
                String []words=w.split(sentence);
                String temp;
                for ( int j= words.length;j>0;j--){
                    for (int i=1; i<j;i++){
                        if (words[i].length()<words[i-1].length()){
                            temp=words[i-1];
                            words[i-1]=words[i];
                            words[i]=temp;
                        }
                    }
                }

                System.out.println(Arrays.toString(words));
            }

        }
    }

    public static void sortingLexemes(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input character(s) to sort lexemes with this character(s): ");
        String characters =scan.nextLine();

        String [] paragraphs= text.split("\n");  // splitting paragraphs

        for (String paragraph:paragraphs) {
            Pattern p= Pattern.compile("[A-ZА-Я]*[.!?]+\\s");// splitting sentences
            String []sentences =p.split(paragraph);

            for (String sentence:sentences) {
                System.out.println(sentence);

                Pattern s= Pattern.compile("\\w*"+characters+"\\w*");  // finding lexemes
                Matcher m = s.matcher(sentence);
                ArrayList<String> lexemes = new ArrayList<>();
                while (m.find()){
                    lexemes.add(m.group());
                }
                System.out.println("Lexemes: "+lexemes);

                int []countLexemes =new int [lexemes.size()];  // counting number lexemes in words
                int maxCount=0;
                for (int i=0; i< lexemes.size();i++){
                    countLexemes[i]=lexemes.get(i).split(characters,-1).length-1;
                    if (countLexemes[i]>maxCount) maxCount=countLexemes[i];
                }

                ArrayList <String> sortedLexemes = new ArrayList<>();   // sorting lexemes
                ArrayList <String> tempArray=new ArrayList<>();
                for ( int j=maxCount ;j>0;j--){
                    for (int i=0; i<lexemes.size();i++){
                        if (countLexemes[i]==j) {
                            while (i!= lexemes.size()&&countLexemes[i] == j) {
                                tempArray.add(lexemes.get(i));
                                i++;
                            }
                            i--;
                        }
                    }
                    Collections.sort(tempArray);
                    sortedLexemes.addAll(tempArray);
                    tempArray.clear();
                }
                System.out.println("Sorted lexemes: "+sortedLexemes+"\n");
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(text);
        boolean input=true;
        while (input)
            switch (choice()) {
                case 1:
                    sortingParagraphs();
                    ;
                    break;
                case 2:
                    sortingSentences();
                    break;
                case 3:
                    sortingLexemes();
                    break;
                case 0:
                    input=false;
                    break;
                default:
                    System.out.println("Make a correct choice!");
            }
    }
}
