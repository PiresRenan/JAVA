package JAVA_CONVERSIONS;
/*The simple code to convert char int in java using Character.getNumericValue(char) method which returns
an integer value. 
*/

public class ConvInt {
    public static void main(String[] args) {
        char c = '1';
        int a = Character.getNumericValue(c);
        System.out.println(a);
    }
}
