package codeWar;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(number(Arrays.asList("", "", "", "", "")));
    }

    public static List<String> number(List<String> lines) {

        System.out.println(lines.size());

        for(int i = 0; i < lines.size(); i++) {
            int newIndex = i + 1;
            lines.set(i, newIndex + ": " + lines.get(i));
        }

        return lines;
    }
}
