package BASIC_JAVA;
public class basic3 {
    public static void main(String[] args) {
        int i, fact = 1 ;
        int number = 5 ; //Isso vai ser o numero fatorado.
        for (i = 1 ; i <= number ; i++) {
            fact = fact * i;
        } 
        System.out.println("Fatoriado de " + number + " é " + fact );
    }
}
