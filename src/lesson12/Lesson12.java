package lesson12;

import java.util.regex.Pattern;

public class Lesson12 {
    public static void print(String text){
        String[] words = text.split("\\s");
        for(String word: words){
            if(Pattern.matches("[A-Z]{2,6}", word)){
                System.out.println(word);
            }
        }
    }
}