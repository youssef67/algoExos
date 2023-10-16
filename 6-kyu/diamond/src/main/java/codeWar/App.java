package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(print(5));
    }

    public static String print(int n) {

        if (n % 2 == 0 || n < 0) {
            return null;
        }

        StringBuilder diamond = new StringBuilder();
        for (int i = 1; i <= n; i += 2) {
            appendLine(diamond, i, n);
        }
        for (int i = n - 2; i > 0; i -= 2) {
            appendLine(diamond, i, n);
        }
        return diamond.toString();
    }

    public static void appendLine(StringBuilder diamond, int size, int totalSize) {
        int spaces = (totalSize - size) / 2;

        for (int i = 0; i < spaces; i++) {
            diamond.append(" ");
        }
        for (int i = 0; i < size; i++) {
            diamond.append("*");
        }
        diamond.append("/n");

    }
}
