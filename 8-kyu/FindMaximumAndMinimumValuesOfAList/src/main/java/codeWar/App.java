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
        System.out.println(min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        System.out.println(max(new int[]{-52, 56, 30, 29, -54, 0, -110}));
    }

    public static int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public static int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }

}
