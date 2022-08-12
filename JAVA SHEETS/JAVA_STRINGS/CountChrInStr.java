package JAVA_STRINGS;
public class CountChrInStr {

    public static void main(String[] args) {
        String string = "Todo mundo deveria aprender a programar, porque ensina como pensar.";
    int count = 0 ;

    for(int i = 0 ; i < string.length(); i++){
        if (string.charAt(i) != ' ') {
            count++;
        }
    }

    System.out.println("Tem "+ count +" caracteres nessa frase.");
    }
}