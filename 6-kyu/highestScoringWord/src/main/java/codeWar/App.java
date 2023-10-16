package codeWar;

import java.util.ArrayList;
import java.util.Arrays;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println(high("taxi ubud"));
    }

    public static String high(String s) {

        String[] strArray = s.split(" ");
        ArrayList<String> liste = new ArrayList<>(Arrays.asList(strArray));

        int sommeMax = 0;
        int tempSommeMax = 0;
        String result = "";
        for (String str : liste) {
            for (int i = 0; i < str.length(); i++) {
                tempSommeMax += (int) str.charAt(i) - 96;
            }

            if (tempSommeMax > sommeMax) {
                sommeMax = tempSommeMax;
                result = str;
            }

            tempSommeMax = 0;
        }

        return result;
    }

    public static String highCodeWar(String s) {

        String winner = "";
        int highScore = 0;

        for (String word : s.split(" ")) {
            int score = 0;
            for (char c : word.toCharArray()) {
                score = c - 'a' + 1;
            }
            if (score > highScore) {
                winner = word;
                highScore = score;
            }
        }

        return winner;
    }
}
