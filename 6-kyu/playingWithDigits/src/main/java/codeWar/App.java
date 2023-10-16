package codeWar;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(digPowCodeWar(3456789, 5));
    }

    public static long digPow(int n, int p) {

        long sum = 0;
        int pow = p;
        String[] numberArray = String.valueOf(n).split("");
        for(String s : numberArray){
            sum += Math.pow(Integer.parseInt(s), pow);
            pow++;
        }

        System.out.println(sum / n);
        return (sum % n == 0) ? sum / n : -1;

    }

    public static long digPowCodeWar(int n, int p) {
        String intString = String.valueOf(n);
    long sum = 0;

        for (int i = 0; i < intString.length(); ++i, ++p) {
            sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
        }

        return (sum % 2 == 0) ? sum / n : -1;
        }
        }
