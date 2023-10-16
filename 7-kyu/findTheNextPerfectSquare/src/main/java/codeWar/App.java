package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(findNextSquare(123457));
    }

    public static long findNextSquare(long sq) {

        long root = (long) Math.sqrt(sq);

        return root * root == sq ? (root + 1) * (root + 1) : -1;
    }
}
