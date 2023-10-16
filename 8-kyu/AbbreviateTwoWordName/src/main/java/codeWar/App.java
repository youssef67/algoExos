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
        System.out.println(abbrevName("youssef moudni toto"));

    }

    /*public static String abbrevName(String name) {

        String[] nameArray = name.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < nameArray.length; i++) {
            res.append(nameArray[i].substring(0, 1).toUpperCase());

            if(nameArray.length - 1 != i) {
                res.append(".");
            }
        }

        return res.substring(0, res.length());
    }*/

    //Solution codeWar
    // Le paramètre est toujours de 2 mots
    public static String abbrevName(String name) {
        String[] nameArray = name.split(" ");
        return (nameArray[0].charAt(0) + "." + nameArray[1].charAt(0)).toUpperCase();
    }



}
