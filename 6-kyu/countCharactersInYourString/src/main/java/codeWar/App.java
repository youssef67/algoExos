package codeWar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(count("aabbbac") );
    }

    public static Map<Character, Integer> count(String str) {

        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (result.containsKey(str.charAt(i))) {
                int nbr = result.get(str.charAt(i)) + 1;
                result.put(str.charAt(i), nbr);
            } else {
                result.put(str.charAt(i), 1);
            }
        }

        return result;
    }

    public static Map<Character, Integer> countCodeWar(String str) {

        Map<Character, Integer> charMap = new HashMap<>();

        for (Character character : str.toCharArray()) {
            if (charMap.containsKey(character)) {
                charMap.put(character, charMap.get(character) + 1);
            } else {
                charMap.put(character, 1);
            }
        }

        return charMap;
    }
}
