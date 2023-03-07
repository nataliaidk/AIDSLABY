package dsaa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Document {


    public static void loadDocument(String name, Scanner scan) {
        //TODO
        if (correctLink(name))
            {
                System.out.println(name);
            }


    }

    // accepted only small letters, capitalic letter, digits nad '_' (but not on the begin)
    public static boolean correctLink(String link) {
        // TODO
        String s = link;
        char[] litery = {'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'i', 'J', 'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 'p', 'P' , 'r', 'R', 's', 'S','t', 'T', 'u', 'U', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'z'};
        char[] liczby = {'1', '2', '3', '4', '5', '6','7','8', '9', '0'};
        char[] znaki = {'_'};
        String s1 = "link=";

        if (s.regionMatches(0, s1, 0, 5)) {
            for (int x = 0; x < litery.length; x++) {
                if (s.startsWith(String.valueOf(litery[x]))) {
                    if (s.contains(String.valueOf(liczby)) && s.contains(String.valueOf(litery)) && s.contains(String.valueOf(znaki)))
                    { return true; }
                }
            }

        } return false;
    }


}


