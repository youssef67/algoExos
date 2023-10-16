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
        System.out.println(oddOrEven(new int[] {}));
    }

    public static String oddOrEven(int[] array) {

//        if (array.length == 0)
//            array = new int[]{0};

//        return (Arrays.stream(array).sum() % 2) == 0 ? "even" : "odd";


        System.out.println(Arrays.stream(array).sum() % 2);
        return "";
    }
}
