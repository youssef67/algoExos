package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(howOld("1 year old"));
    }

    public static int howOld(final String herOld) {
        return Integer.parseInt(herOld.substring(0, 1));
    }

    public static int howOldCodeWar(final String herOld) {
        return Character.getNumericValue(herOld.charAt(0));
    }
}
