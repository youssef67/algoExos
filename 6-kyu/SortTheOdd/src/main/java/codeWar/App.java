package codeWar;


import java.lang.reflect.Array;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sortArrayCodeWar(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
        // output { 1, 3, 2, 8, 5, 4 }
    }

    public static int[] sortArray(int[] array) {

        int[] test = new int[]{1, 8, 3, 6, 5, 4, 7, 2, 9, 0};

        ArrayList<Integer> mapOdd = new ArrayList<>();
        ArrayList<Integer> finalArray = new ArrayList<>();

        for (int d : array) {
            if (d % 2 != 0) {
                mapOdd.add(d);
                finalArray.add(null);
            }
            else finalArray.add(d);

        }

        Collections.sort(mapOdd);

        for (int i = 0; i < finalArray.size(); i++) {
            if (finalArray.get(i) ==  null) {
                finalArray.set(i, mapOdd.get(0));
                mapOdd.remove(0);
            }
        }

        int[] result = new int[finalArray.size()];
        for(int i = 0; i < finalArray.size(); i++) {
            result[i] = finalArray.get(i);
        }

        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(result));

        System.out.println(Arrays.equals(test, result));
        return result;
    }

    public static int[] sortArrayCodeWar(int[] array) {
        // Sort the odd numbers only
        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        // Then merge them back into original array
        for (int j = 0, s = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
        }

        return array;
    }
}
