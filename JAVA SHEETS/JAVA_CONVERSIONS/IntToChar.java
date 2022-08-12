package JAVA_CONVERSIONS;
/*In this which returns integer value of specified char value using String.valueOf(char) method.
*/
public class IntToChar {
    public static void main(String[] args) {
        char c = '1';
        int a = Integer.parseInt(String.valueOf(c));
        System.out.println(a);
    }
}
