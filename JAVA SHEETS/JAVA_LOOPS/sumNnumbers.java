package JAVA_LOOPS;
import java.util.Scanner;

public class sumNnumbers {
    public static void main(String[] args) {
        int n, i = 1, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite n: ");
        n = sc.nextInt();
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum dos primeiros "+ n + " numeros naturais é: "+ sum);
    }
}
