package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(liters(6.7));
    }

    public static int liters(double time) {
        return (int) Math.floor(time * 0.5);
    }
}
