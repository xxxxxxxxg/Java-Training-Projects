import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1...n
//How to find Missing Integers in Given Array of Numbers with Duplicates in JAVA.
public class FindMissing {
    public void findMissing(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 1; i <= nums.length; i++) {
            if (i != nums[i - 1]) {
                res.add(i);
            }
        }

        if (res.size() == 0) {
            System.out.println("no missing numbers:");
            return;
        }

        System.out.println("missing numbers:");
        for (int i: res) {
            System.out.println(i);
        }
        return;
    }
}
