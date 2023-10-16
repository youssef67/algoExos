package codeWar;

import java.util.Arrays;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(isSquareCodeWar(25));
    }

    public static boolean isSquare(int n) {

        int odd = 1;
        while (n > 0)
        {
            n -= odd;
            odd += 2;
        }

        return n == 0;
    }

    public static boolean isSquareCodeWar(int n) {

        return Math.sqrt(n) % 1 == 0;

    }
}
