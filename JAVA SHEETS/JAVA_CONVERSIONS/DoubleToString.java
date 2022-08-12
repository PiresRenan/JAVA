package JAVA_CONVERSIONS;
public class DoubleToString {
    public static void main(String[] args) {
        //METHOD 1
        double d1 = 12.3;
        String s1 = String.valueOf(d1);
        System.out.println(s1);

        //METHOD 2
        double d2 = 89.7;
        String s2 = Double.toString(d2);
        System.out.println(s2);
    }
}
