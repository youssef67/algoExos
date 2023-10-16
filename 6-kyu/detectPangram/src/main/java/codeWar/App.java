package codeWar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String pangram1 = "ABCD45EFGH,IJK,LMNOPQR56STUVW3XYZ";
        System.out.println(check(pangram1));
    }

    public static boolean check(String sentence){
        List<String> liste = new ArrayList<>(
                Arrays.asList(
                        sentence.
                        replaceAll("[^\\sa-zA-Z0-9]", "").
                                replaceAll("\\d", "").
                                toLowerCase().
                                split("")));


        List<String> listeDistinct = liste.stream().distinct().collect(Collectors.toList());

        return listeDistinct.size() == 26;
    }

    public static boolean checkCodeWar(String sentence) {
        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }
}
