package JAVA_STRINGS;
public class ReplaceSpacesWithSpecialChr {
    public static void main(String[] args) {
        String string = "Falar é fácil. Mostre-me o código.";
        char ch = '-';
        string = string.replace(' ', ch);

        System.out.println("A frase com os espaços alterados é: ");
        System.out.println(string);
    }
}
