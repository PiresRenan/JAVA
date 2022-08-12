package JAVA_LOOPS;
public class Fatorial {
    public static void main(String[] args) {
        int i, fact = 1;
        int number = 5;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("O fatorial de "+ number + " é " + fact);
    }
}
