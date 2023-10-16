package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(isLove(2, 2));
    }

    public static boolean isLove(final int flower1, final int flower2) {

        return (flower1 % 2) == (flower2 % 2) ? false : true;

    }
}
