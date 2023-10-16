package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(accum("ZpglnRxqenU"));
    }

    public static String accum(String s) {

        StringBuilder buider = new StringBuilder();

        int i = 0;
        for (char c : s.toCharArray()) {
            if (i > 0) buider.append("-");
            buider.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++) buider.append(Character.toLowerCase(c));
            i++;
        }

        return buider.toString();














//        int i = 0;
//        for (char c : s.toCharArray()) {
//            if(i > 0) bldr.append("-");
//            bldr.append(Character.toUpperCase(c));
//            for (int j = 0; j < i; j++) {
//                bldr.append(Character.toLowerCase(c));
//            }
//            i++;
//        }
//
//        return bldr.toString();

    }
}
