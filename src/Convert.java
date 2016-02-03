/*
 Write a class which has a static method called convert. This method gets an array of Strings,
 copies every elements in the array to an ArrayList and returns with the ArrayList
 */

import java.util.ArrayList;

public class Convert {
    public static ArrayList convert(ArrayList<String> words) {
        ArrayList result = null;
        for(String i:words) {
            result.add(i);
        }
        return result;
    }
}
