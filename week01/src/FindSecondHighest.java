//Write a Java Program to find the second highest number in an array.
public class FindSecondHighest {

    public void find(int[] arr) {
        //Arrays.sort(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("The second highest number is : " + arr[arr.length - 2]);
    }

    //using quickSort insted of built-in function
    public void quickSort(int[] nums, int start, int end) {
        if (start >= end) return;
        int left = start, right = end;
        int pivot = (start + end) / 2;
        while (left <= right) {
            while (left <= right && nums[left] < nums[pivot]) {
                left++;
            }
            while (left <= right && nums[right] > nums[pivot]) {
                right--;
            }

            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        quickSort(nums, start, right);
        quickSort(nums, left, end);
    }
}
