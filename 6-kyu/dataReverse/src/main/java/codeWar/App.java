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
        int[] data1= {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
        System.out.println(DataReverse(data1));
    }

    public static int[] DataReverse(int[] data) {

        int[] result = new int[data.length];
        int indexStart;
        int indexResult = 0;

        for (int i = data.length / 8; i > 0; i--) {
            indexStart = i * 8;
            for (int j = 8; j > 0; j--) {
                result[indexResult] = data[indexStart - j];
                indexResult++;
            }
        }

        return result;
    }

    public static int[] DataReverseCodeWar(int[] data) {
        int bytes[] = new int[data.length];
        for (int i = data.length-8, j=0; i>=0; i-=8, j+=8) {
            System.arraycopy(data, i, bytes, j, 8);
        }
        return bytes;
    }
}
