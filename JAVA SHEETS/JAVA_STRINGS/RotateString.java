package JAVA_STRINGS;
public class RotateString {
    public static void main(String[] args) {
        String str1 = "abcde" , str2 = "deabc";
        if (str1.length() != str2.length()) {
            System.out.println("A string dada não é o oposto da outra!");
        } else {
            str1 = str1.concat(str1);
            if (str1.indexOf(str2) != -1) {
                System.out.println("A String é o oposto da outra!");
            } else {
                System.out.println("A string dada não é o oposto da outra!");
            }
        }
    }
}
