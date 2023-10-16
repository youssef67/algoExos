package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(getVolumeOfCuboid(6.3,2,5));
    }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {

        return length * width * height;
    }
}
