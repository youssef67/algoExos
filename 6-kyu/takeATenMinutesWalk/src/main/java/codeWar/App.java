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
        System.out.println(isValid((new char[] {'n','s','n','s','n','s','n','s','n','s'})));
//        System.out.println(isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
//        System.out.println(isValid(new char[] {'w'}));
//        System.out.println(isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
//        System.out.println(isValid(new char[] {'n','e','n','e','n','e','n','e','n','e'}));
    }

    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        if (walk.length == 10)
        {
            HashMap<Character, Integer> list = new HashMap<>();

            for (char c : walk) {
                if (!list.containsKey(c))
                     list.put(c, 1);
                else {
                    int val = list.get(c);
                    list.put(c, ++val);
                }
            }

            if (list.size() == 2) {
                if (list.containsKey('n') && list.containsKey('s') && list.containsValue(5)) {
                    return true;
                } else if (list.containsKey('w') && list.containsKey('e') && list.containsValue(5)) {
                    return true;
                }
            } else if (list.size() == 4) {
                if (list.get('n') == list.get('s') && list.get('e') == list.get('w'))
                    return true;
                else
                    return false;
            } else {
                return false;
            }
        }

        return false;
    }

    public static boolean isValidCodeWar(char[] walk) {

        if (walk.length != 10) {
            return false;
        }

        int x = 0, y = 0;
        for (int i = 0; i < 10; i++) {
            switch (walk[i]) {
                case 'n':
                    y++;
                    break;
                case 'e':
                    x++;
                    break;
                case 's':
                    y--;
                    break;
                case 'w':
                    x--;
                    break;
            }
        }

        return x == 0 && y == 0;
    }
}
