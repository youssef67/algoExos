package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(binaryAddition(5,9));
    }

    public static String binaryAddition(int a, int b) {

        return Integer.toBinaryString(a + b);
    }
}
