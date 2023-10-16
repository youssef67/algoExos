package codeWar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(comp(null, b));
    }

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;

        int[] squareA = new int[a.length];

        for (int i = 0; i < squareA.length; i++) {
            squareA[i] = a[i] * a[i];
        }

        Arrays.sort(squareA);
        Arrays.sort(b);

        return Arrays.equals(squareA, b);
    }
}
