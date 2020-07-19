import java.util.HashMap;
import java.util.Map;

//2.) Write a Java Program to count the number of words in a string using HashMap.
public class CountWords {
    public void countWords(String strs) {
        System.out.println("Problem 2 Input string: " + strs);
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char ch: strs.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        for (char ch: map.keySet()) {
            count += map.get(ch);
        }

        System.out.println("The input string has " + count + " words.");
    }
}
