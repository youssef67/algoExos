package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final int COUT_JOUR = 40;

    public static void main( String[] args )
    {
        System.out.println(rentalCarCost(5));


    }

    public static int rentalCarCost(int d) {

        if (d < 3) return d * COUT_JOUR;
        if (d >= 7) return d * COUT_JOUR - 50;
        else return d * COUT_JOUR - 20;
    }
}
