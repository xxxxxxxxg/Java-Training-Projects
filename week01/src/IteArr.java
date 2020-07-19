import java.util.ArrayList;

//Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
public class IteArr {
    public void iteArr (ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            System.out.println("invalid input");
            return;
        }

        System.out.println("forloop");
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            System.out.println(i);
        }

        System.out.println("advforloop");
        for (int i: list) {
            System.out.println(i);
        }

        System.out.println("whileloop");
        int j = 0;
        while (j < list.size()) {
            System.out.println(list.get(j));
            j++;
        }

    }
}
