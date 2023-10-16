package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(camelCase("camelCasing"));
    }

    public static String camelCase(String input)
    {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i))) str.append(" " + input.charAt(i));
            else str.append(input.charAt(i));
        }

        return str.toString();
    }
}
