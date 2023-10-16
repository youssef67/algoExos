package codeWar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(minValue(new int[] {5, 7, 9, 5, 7}));
    }

    public static int minValue(int[] values) {

        List<Integer> liste = Arrays.stream(values).boxed().distinct().sorted().collect(Collectors.toList());

        String result = "";
        for (Integer d : liste) {
            result += d;
        }

        return Integer.parseInt(result);
    }

    public static int minValueCodeWar(int[] values) {

        String s = Arrays.stream(values).sorted().distinct().mapToObj(Integer::toString).collect(Collectors.joining(""));

        return Integer.valueOf(s);
    }
}
