package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(areYouPlayingBanjoCodeWar("yolf"));
    }

    public static String areYouPlayingBanjo(String name) {
        System.out.println(name.substring(0, 1).toLowerCase().equals("r"));

        return (name.substring(0, 1).toLowerCase().equals("r")) ? name + " plays banjo" : name + " does not play banjo";
    }

    public static String areYouPlayingBanjoCodeWar(String name) {
        return name.toUpperCase().startsWith("R") ? name + " plays banjo" : name + " does not play banjo";
    }

}
