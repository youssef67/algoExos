package codeWar;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(check(new Object[] {66, 101}, 66) );
    }

    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }
}
