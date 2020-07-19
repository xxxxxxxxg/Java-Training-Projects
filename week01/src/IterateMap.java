import java.util.HashMap;

//3.) Write a Java Program to iterate HashMap using While and advance for loop.
public class IterateMap {
    public void iterateMap() {
        HashMap<Integer, String> map = new HashMap<>();
        initMap(map);
        int i = 1;

        System.out.println("while loop results:");
        while (i < map.size()) {
            if (map.containsKey(i)) {
                System.out.println("key: " + i + "," + "value: " + map.get(i));
            }
            i++;
        }

        System.out.println("advance for loop results:");
        for (int key: map.keySet()) {
            System.out.println("key: " + key + "," + "value: " + map.get(key));
        }
    }

    public void initMap(HashMap<Integer, String> map) {
        map.put(1, "value1");
        map.put(2, "value2");
        map.put(3, "value3");
        map.put(4, "value4");
    }
}
