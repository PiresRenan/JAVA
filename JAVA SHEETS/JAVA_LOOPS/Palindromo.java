package JAVA_LOOPS;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        int r, sum = 0, temp;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero : ");
        n = sc.nextInt();
        temp = n;
        sc.close();
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n/10;
        }
        if (temp == sum) {
            System.out.println(temp + " é palindromo!");
        } else {
            System.out.println(temp + " NÃO é palindromo!");
        }
    }
}
