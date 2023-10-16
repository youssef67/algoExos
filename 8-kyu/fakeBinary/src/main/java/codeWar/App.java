package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(fakeBin("8"));
    }

    public static String fakeBin(String numberString) {

        String[] numberStringArray = numberString.split("");
        StringBuilder sb = new StringBuilder();

        for (String number : numberStringArray) {
            int numberInt = Integer.parseInt(number);

            if (numberInt < 5 )
                sb.append("0");
            else
                sb.append("1");
        }

        return sb.substring(0);
    }
}
