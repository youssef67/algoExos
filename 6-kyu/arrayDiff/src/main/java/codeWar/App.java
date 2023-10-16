package codeWar;

import java.lang.reflect.Array;
import java.util.ArrayList;
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
        arrayDiff(new int [] {1,2}, new int[] {1});
        arrayDiff(new int [] {1,2,2}, new int[] {1});
        arrayDiff(new int [] {1,2,2}, new int[] {2});
        arrayDiff(new int [] {1,2,2}, new int[] {});
        arrayDiff(new int [] {}, new int[] {1,2});
    }

    public static int[] arrayDiff(int[] a, int[] b) {

        ArrayList<Integer> aAsList = (ArrayList<Integer>) Arrays.stream(a).boxed().collect(Collectors.toList());
        ArrayList<Integer> bAsList = (ArrayList<Integer>) Arrays.stream(b).boxed().collect(Collectors.toList());

        aAsList.removeAll(bAsList);

        int[] result = new int[aAsList.size()];

        for (int i = 0 ; i < aAsList.size(); i++) {
            result[i] = aAsList.get(i);
        }

        System.out.println(aAsList);
        return result;
    }

    public static int[] arrayDiffCodeWar(int[] a, int[] b) {
        List<Integer> listeA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listeB = Arrays.stream(b).boxed().collect(Collectors.toList());

        listeA.removeAll(listeB);

        return listeA.stream().mapToInt(e -> e).toArray();

    }
}
