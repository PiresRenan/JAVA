package JAVA_STRINGS;
public class FindWhiteSpaces {
    public static void main(String[] args) {
        String str1 = "Remove espaços em branco";
        str1 = str1.replaceAll("\\s+" , "");
        System.out.println("Frase depois de tirar todos os espaços em branco : " + str1);
    }
}
