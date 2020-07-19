//Write a Java Program to remove all white spaces from a string without using replace.
public class RemoveWhiteSpace {
    public void removeWhiteSpace(String str) {
        String[] strArr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s: strArr) {
            sb.append(s);
        }
        System.out.println("After removing the white spacee:" + sb.toString());
    }

}
