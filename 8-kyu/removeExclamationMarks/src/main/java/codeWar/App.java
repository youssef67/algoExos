package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(removeExclamationMarks("Youssef !!!"));
    }

    public static String removeExclamationMarks(String s) {

        return s.replaceAll("!", "" );
    }
}
