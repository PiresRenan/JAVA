package JAVA_LOOPS;
import java.util.Scanner;

public class Cont2string {
    static int countDigit(int n) {
        String num = Integer.toString(n);
        return num.length();
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero : ");
        n = sc.nextInt();
        sc.close();
        System.out.println("Numero de digitos e : " + countDigit(n));
    }
}
