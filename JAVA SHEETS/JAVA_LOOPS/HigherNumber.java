package JAVA_LOOPS;
import java.util.Scanner;

public class HigherNumber {
    public static void main(String[] args) {
        int n1 , n2 , n3 , result , temp ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero : ");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero : ");
        n2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero : ");
        n3 = scanner.nextInt();
        scanner.close();

        temp = n1 > n2 ? n1 : n2 ;
        result = n3 > temp ? n3 : temp ;
        System.out.println("O maior numero é : " + result);
    }
    
}
