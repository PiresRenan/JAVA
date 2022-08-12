package JAVA_CONVERSIONS;
public class FloatToString {
    public static void main(String[] args) {
        float f = 23.6f;
        String s1 = Float.toString(f);
        String s2 = String.valueOf(f);

        System.out.println(s1);
        System.out.println(s2);
    }
}
