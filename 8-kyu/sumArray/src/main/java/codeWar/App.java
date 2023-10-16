package codeWar;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sumCodeWar(new double[] {1, 5.2, 4, 0, -1}));
    }

//    public static double sum(double[] numbers) {
//
//        double result = 0;
//
//        for (double num : numbers) {
//            result += num;
//        }
//
//        return result;
//
//    }

    public static double sumCodeWar(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
