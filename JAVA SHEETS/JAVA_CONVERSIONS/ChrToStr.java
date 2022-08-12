package JAVA_CONVERSIONS;
import java.util.Arrays;

class Rextester {
    public static void main(String[] args) {

        // Convert Character to String
        char ch = 'c';
        String st = Character.toString(ch);

        // you can use String static method valueOf(char) to convert char into string
        // st = String.valueOf(ch);
        System.out.println("The string is: " + st);

        //Convert char array to String
        char[] chars = {'A', 'p', 'k', 'Z', 'u','b','e'};

        String str1 = String.valueOf(ch);
        String str2= new String(chars);

        System.out.println(str1);
        System.out.println(str2);

        //Convert String to char array
        String str3 = "This is great";

        char[] charArray = str3.toCharArray();
        System.out.println(Arrays.toString(charArray));
    }
}
