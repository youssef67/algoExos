package codeWar;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});

        System.out.println(countPassengers(list));
    }


    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
        int number = 0;
        for (int i = 0; i < stops.size(); i++) {
            number += stops.get(i)[0] - stops.get(i)[1];
        }

        return number;
    }
}
