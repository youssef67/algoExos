package codeWar;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String art[] = new String[]{"BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B", "C", "D"};

        System.out.println(stockSummary(art, cd));
    }

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOf1stLetter.length == 0 || lstOfArt.length == 0) return "";

        StringBuilder result = new StringBuilder();
        int[] liste = new int[lstOf1stLetter.length];


        for (int i = 0; i < lstOf1stLetter.length; i++) {
            for (String l : lstOfArt) {
                String firstLetter = l.substring(0, 1);
                int bookNumber = Integer.parseInt(l.split(" ")[1]);

                if (firstLetter.equals(lstOf1stLetter[i])) {
                    liste[i] += bookNumber;
                }
            }

            result.append("(" + lstOf1stLetter[i] + " : " + liste[i] + ") - ");
        }


        return result.substring(0, result.length() - 3);
    }
}
