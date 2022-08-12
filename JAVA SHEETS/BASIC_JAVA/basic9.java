package BASIC_JAVA;
import java.util.Scanner;
public class basic9 {
    public static void main(String[] args) {

        int num1 , num2 , n3 , result , temp ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeiro Numero : ");
        num1 = scanner.nextInt();
        System.out.println("Segundo Numero : ");
        num2 = scanner.nextInt();
        System.out.println("Terceiro Numero : ");
        n3 = scanner.nextInt();
        scanner.close();

        temp = num1 > num2 ? num1 : num2;
        result = n3 > temp ? n3 : temp;

        System.out.println("O maior numero é : " + result);

    }
}
