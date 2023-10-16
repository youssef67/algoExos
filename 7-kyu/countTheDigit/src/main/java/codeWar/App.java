package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(nbDig(11549, 1));
    }

    public static int nbDig(int n, int d) {
        int count = 0;
        String matcher = Integer.toString(d);

        for (int i = 0; i <= n; i++) {
            String numberToString = Long.toString(i * i);

            for (int j = 0; j < numberToString.length(); j++) {
                if (Character.toString(numberToString.charAt(j)).equals(matcher)) {
                    count++;
                }
            }
        }

        return count;
    }
}
