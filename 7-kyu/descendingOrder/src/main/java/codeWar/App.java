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
        System.out.println(sortDescCodeWar(420145));
    }

    public static int sortDesc(final int num) {

        String str = String.valueOf(num);

        char[] digits = str.toCharArray();
        Arrays.sort(digits);

        return Integer.parseInt(new StringBuilder(new String(String.valueOf(digits))).reverse().toString());
    }

    public static int sortDescCodeWar(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.<String>reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}
