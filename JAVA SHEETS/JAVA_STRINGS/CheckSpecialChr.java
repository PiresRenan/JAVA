package JAVA_STRINGS;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckSpecialChr {
    static void onlySpecialCharacters(String str){
        String regex = "[<a-zA-Z0-9]+";
        Pattern p = Pattern.compile(regex);

        if (str == null) {
            System.out.println("Não!");
            return;
        }
        Matcher m = p.matcher(str);

        if (m.matches()) {
            System.out.println("Sim!");
        }else {
            System.out.println("Não!");
        }
    }
    public static void main(String[] args) {
        String str = "@#$&%!~";
        onlySpecialCharacters(str);

        String str1 = "ApkZube@123";
        onlySpecialCharacters(str1);

    }
}
