package JAVA_LOOPS;
import java.util.Scanner;

public class Contador {

    static int countDigit (long n){
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        long n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero : ");
        n = sc.nextInt();
        sc.close();
        System.out.println("Numero de digitos e : " + countDigit(n));
    }
}
