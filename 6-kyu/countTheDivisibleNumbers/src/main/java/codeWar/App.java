package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(divisibleCount(101,2147483647,11));
    }

    public static long divisibleCount(long x, long y, long k) {

        if(x%k == 0) return (y / k - x / k + 1);
        else return (y / k - x / k);
    }
}
