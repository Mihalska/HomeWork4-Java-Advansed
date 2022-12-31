package task;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decoder {
    public static void main(String[] args)  {
        String s = "Сьогодні на вулиці холодно. Біля лісу у сугробі росте ялинка.";
        String s2 = "Ки́їв — столиця та найбільше місто України, одне з найбільших і найстаріших міст у Європі. Біля Києва розташовано безліч містечок.";
        try {
            File file = new File("C:\\Users\\Public\\Homework 4.4\\src\\task\\Voc");
            BufferedReader text = new BufferedReader(new FileReader(file));
            String temp;
            StringBuilder s1 = new StringBuilder();
            while ((temp = text.readLine()) != null) {
                s1.append(temp);
            }
            text.close();
            String[] words = s1.toString().split(",");
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].trim();
                words [i] = " " + words[i] + " ";
            }
            for (String word : words) {
                Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
                Matcher matcher = pattern.matcher(s);
                Matcher matcher1 = pattern.matcher(s2);
                s = matcher.replaceAll(" Java ");
                s2 = matcher1.replaceAll(" Java ");
            }
            System.out.println(s);
            System.out.println(s2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
