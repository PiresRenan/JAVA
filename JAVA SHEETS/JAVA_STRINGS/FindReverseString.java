package JAVA_STRINGS;
public class FindReverseString {
    public static void main(String[] args) {
        String string = "Sonho Grande";
        String reversedStr = "";

        for (int i = string.length() - 1 ; i >= 0 ; i--) {
            reversedStr = reversedStr + string.charAt(i);
        }

        System.out.println("String Original: " + string);
        System.out.println("String revertida: " + reversedStr);
    }
}
