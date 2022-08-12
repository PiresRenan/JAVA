package JAVA_LOOPS;
import java.util.Scanner;

public class FibonacciSeq {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros da sequencia de fibonacci quer? ");
        count = sc.nextInt();
        System.out.println("A sequencia tera " + count + " numeros sequenciais : ");
        System.out.print(n1 + " , " + n2);/*Mostrando o 0 e 1 para que siga apartir do 2*/
        sc.close();

        for (i = 2 ; i < count ; i++) {
            n3 = n1 + n2;
            System.out.print(" , " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
