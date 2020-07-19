//4.) Write a Java Program to find whether a string or number is palindrome or not.
public class CheckPalindrome {

    //check string
    public void checkPalidrome(String str) {
        System.out.println("The input string is:" + str);
        if (str == null || str.length() == 0) return;

        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("Not a palidrome!");
                return;
            }
            left++;
            right--;
        }

        System.out.println("It is a palidrome!");
    }

    //check number
    public void checkPalidrome(int num) {
        String str = String.valueOf(num);
        checkPalidrome(str);
    }
}
