package JAVA_STRINGS;
public class SwapStringsWithoutTemp {
    public static void main(String[] args) {

        String str1 = "Bom" , str2 = "Dia";
        System.out.println("Frase antes da troca: " + str1 + " " + str2);

        str1 = str1 + str2;
        str2 = str1.substring(0,(str1.length()-str2.length()));
        str1 = str1.substring(str2.length());

        System.out.println("Frase depois da troca: " + str1 + " " + str2);
    }
}
