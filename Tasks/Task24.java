package Strings;

public class Task24 {
    public static void main(String[] args) {
//       С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

        String informatica = "информатика";
        char[]chars=informatica.toCharArray();
        String cake=String.valueOf(chars, informatica.indexOf('т'), 1);
        cake+= String.valueOf(chars, informatica.indexOf('о'), 1);
        cake+= String.valueOf(chars, informatica.indexOf('р'), 1);
        cake+= String.valueOf(chars, informatica.indexOf('т'), 1);


        System.out.println(cake);
    }
}
