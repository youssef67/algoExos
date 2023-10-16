package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(enoughCodeWar(100, 60, 50));
    }

//    public static int enough(int cap, int on, int wait) {
//        int num =  (cap - on) - wait;
//
//        return (num > 0) ? 0 : Math.abs(num);
//    }

    public static int enoughCodeWar(int cap, int on, int wait) {
        return Math.max(0, on + wait - cap);
    }
}
