package BASIC_JAVA;
public class basic10 {
    private static String str3;

    public static void main(String[] args) {
        String str1 = "ApkZube" ;
        String str2 = "" ;
        str3 = null;
        boolean b ;
        b = (str1 == null || str1.length() == 0 );
        System.out.println("String 1 é nulo ou vazio?" + b);

        b = (str1 == null || str2.length() == 0 );
        System.out.println("String 2 é nulo ou vazio?" + b);

        b = (str1 == null || str3.length() == 0 );
        System.out.println("String 3 é nulo ou vazio?" + b);

    }
    
}
