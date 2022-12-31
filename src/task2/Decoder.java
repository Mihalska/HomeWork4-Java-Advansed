package task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//у пакеті task - виконання цього завдання з файлом прийменників;
public class Decoder {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\b\\w([^s,d]{1,2})\\b) ")  ;

        Matcher matcher = pattern. matcher("Ukraine is famous in more countries for its history and different places of interest.");
        System.out.println(matcher.replaceAll("Java ") );
    }
}
