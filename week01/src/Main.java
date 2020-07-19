import com.sun.tools.javac.comp.Check;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Problem1
        String str = "abcdefg";
        ReverseString rs = new ReverseString();
        rs.reverseString("abcdefg");

        //Problem2
        str = "aabbccdddefg";
        CountWords cw = new CountWords();
        cw.countWords(str);

        //Problem3
        IterateMap ite = new IterateMap();
        ite.iterateMap();

        //Problem4
        CheckPalindrome cp = new CheckPalindrome();
        cp.checkPalidrome(12345);
        cp.checkPalidrome("abcdefg");
        cp.checkPalidrome(3223);
        cp.checkPalidrome("beb");

        //problem5
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 5; i >= 0; i--) {
            list.add(i);
        }
        IteArr iteA = new IteArr();
        iteA.iteArr(list);

        //Problem6
        RemoveDuplicates rd = new RemoveDuplicates();
        rd.removeDuplicates("abbccdefghiihabc");

        //Problem7
        int[] arr = new int[]{1,2,3,4,5,6,7,8,10,1,2,3,4,5,6,7,8};
        FindSecondHighest f = new FindSecondHighest();
        f.find(arr);

        //Problem8
        RemoveWhiteSpace rw = new RemoveWhiteSpace();
        rw.removeWhiteSpace("           ");
        rw.removeWhiteSpace("Remove white     space ");

        //Problem9
         int[] nums = new int[]{2,2,4,4,5};
         FindMissing fm = new FindMissing();
         System.out.println("The missing number is:");
         fm.findMissing(nums);

        //Problem10
        //The driven code is in class MostRepeatedWord
    }
}
