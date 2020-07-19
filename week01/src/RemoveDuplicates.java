import java.util.HashMap;

public class RemoveDuplicates {

    public void removeDuplicates(String str) {
        if (str == null || str.length() == 0) {
            return;
        }

        HashMap<Character, Integer> seen = new HashMap<Character, Integer>();
        StringBuilder sb = new StringBuilder();
        for (Character ch: str.toCharArray()) {
            if (!seen.containsKey(ch)) {
                seen.put(ch, 1);
                sb.append(ch);
            }
        }

        System.out.println("After removing duplicates: " + sb.toString());
    }
}
