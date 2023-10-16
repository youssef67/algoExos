package codeWar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        System.out.println(findUniq(new double[]{0, 1, 0}));
    }

    public static double findUniq(double arr[]) {

        List<Double> liste = new ArrayList<>();

        for (double d : arr) {
            liste.add(d);
        }

        List<Double> listeWithUniqueValues = liste.stream().distinct().collect(Collectors.toList());

        double result = 0.0;
        for (double d : listeWithUniqueValues) {
            if (Collections.frequency(liste, d) == 1) result =  d;
        }

        return result;
    }

    public static double findUniqCodeWar(double arr[]) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }
}
