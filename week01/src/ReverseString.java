//1.Write a Java Program to reverse a string without using String inbuilt function reverse.
public class ReverseString {
    public void reverseString(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("invalid input");
            return;
        }
        System.out.println("Problem 1 Input string: " + str);
        int p = str.length() - 1;
        String ans = "";
        while (p >= 0) {
            ans += str.charAt(p);
            p--;
        }
        System.out.println("Revesed string: " + ans);
        return;
    }
}
