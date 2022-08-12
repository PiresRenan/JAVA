package JAVA_STRINGS;
public class CountVogalsConsoants {
    public static void main(String[] args) {

        int vCount = 0 , cCount = 0;
        String str = "Falar é fácil. Mostre-me o código!";
        str = str.toLowerCase();

        for (int i = 0 ; i < str.length() ; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
             str.charAt(i) == 'u' ){
                 vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                cCount++;
            }  
        }
        System.out.println("São "+ vCount + " vogais nesta frase.");
        System.out.println("São "+ cCount + " consoantes nesta frase.");
    }
}
