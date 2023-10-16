package codeWar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(order(""));
    }

    public static String order(String words) {
        if (words == "") return "";

        String[] arrSortWords = new String[ words.split(" ").length];

        for(String word :  words.split(" ")) {
            for (int i = 0; i < word.length(); i++) {
                if (Character.isDigit(word.charAt(i))) {
                    arrSortWords[Character.getNumericValue(word.charAt(i) - 1)] = word;
                }
            }
        }

        return String.join(" ", arrSortWords);
    }


}
