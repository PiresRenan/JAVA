package JAVA_STRINGS;
public class PalindromoOrNot {
    public static void main(String[] args) {
        String string = "Ana" ; 
        boolean flag = true ;

        string = string.toLowerCase();

        for (int i = 0 ; i < string.length() / 2 ; i++)  {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                flag = false ;
                break ;
            }
        }
        if (flag) {
            System.out.println("A frase dada é palindromo!");
        } else {
            System.out.println("A frase dada NÃO é palindromo!");
        }
    }
}
