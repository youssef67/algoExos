package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(areaOrPerimeter(6, 10));
    }

    public static int areaOrPerimeter(int l, int w) {

        return (l == w) ? l * 2 : (l + w) * 2;
    }
}
