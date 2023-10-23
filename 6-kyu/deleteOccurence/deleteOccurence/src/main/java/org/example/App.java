package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(deleteNth(new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3));
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        List<Integer> liste = Arrays.stream(elements).boxed().collect(Collectors.toList());
        List<Integer> distinctElements = liste.stream().distinct().collect(Collectors.toList());

        for (int d : distinctElements) {
            int frequency = Collections.frequency(liste, d);
            if (frequency > maxOccurrences) {
                for (int i = 0; i < frequency - maxOccurrences; i++) {
                    liste.remove(liste.lastIndexOf(d));
                }
            }
        }

        System.out.println(Arrays.toString(liste.toArray()));
        return liste.stream().mapToInt(i -> i).toArray();
    }

    public static int[] deleteNthCodeWar(int[] elements, int maxOccurences) {

        if(maxOccurences < 1 ) return new int[0];

        final HashMap<Integer, Integer> map = new HashMap<>();
        final List<Integer> list = new ArrayList<>();

        for (final Integer i : elements) {
            final Integer v = map.put(i, map.getOrDefault(i, 0) + 1);
            if (v == null || v < maxOccurences) list.add(i);
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
