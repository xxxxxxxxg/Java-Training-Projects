import java.util.Arrays;
//Write a Java Program to find the second highest number in an array.
public class FindSecondHighest {

    public void find(int[] arr) {
        Arrays.sort(arr);
        System.out.println("The second highest number is : " + arr[arr.length - 2]);
    }

    public void quickSort(int[] nums) {

    }
}