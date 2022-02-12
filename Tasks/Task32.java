package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//      Дана строка, содержащая следующий текст (xml-документ):
//      Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа
//      и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
//      Пользоваться готовыми парсерами XML для решения данной задачи нельзя.

public class Task32 {
    static String xmlDoc =
            "<notes>\n" +
                "<note id = \"1\">\n" +
                    "<to>Вася</to>\n" +
                    "<from>Света</from>\n" +
                    "<heading>Напоминание</heading>\n" +
                    "<body>Позвони мне завтра!</body>\n" +
                "</note>\n" +
                "<note id = \"2\">\n" +
                    "<to>Петя</to>\n" +
                    "<from>Маша</from>\n" +
                    "<heading>Важное напоминание</heading>\n" +
                "<body/>\n" +
                "</note>\n" +
            "</notes>";


    public static void xmlAnalyzer(String str) {
        Pattern pOpen = Pattern.compile("^<\\w.+?>");
        Pattern pBody = Pattern.compile(">.+?<");
        Pattern pClose = Pattern.compile("</\\w+>");
        Pattern pEmpty = Pattern.compile("^<\\w.+?/>");

        Matcher tagOpen = pOpen.matcher(str);
        Matcher tagClose = pClose.matcher(str);
        Matcher tagBody = pBody.matcher(str);
        Matcher tagEmpty = pEmpty.matcher(str);

        if (tagEmpty.find()) {
            System.out.printf("Tag %s  is without body\n", tagEmpty.group());
        }
        else {
            if (tagOpen.find()) {
                System.out.printf("Tag %s  opened\n", tagOpen.group());
            }
            if (tagBody.find()) {
                System.out.printf("The last tag   consists \"%s\"\n", tagBody.group().substring(1, tagBody.group().length() - 1));
            }
            if (tagClose.find()) {
                System.out.printf("Tag %s  closed\n",tagClose.group());
            }
        }

    }

    public static void main(String[] args) {
        String [] strings = xmlDoc.split("\n");

        for (String str : strings) {
            xmlAnalyzer(str);
        }


    }
}
