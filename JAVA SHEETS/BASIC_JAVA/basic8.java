package BASIC_JAVA;
import java.util.Scanner;
public class basic8 {
    public static void main(String[] args) {
        int num;
        System.out.println("Digite um numero inteiro : ");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        input.close();

        if (num % 2 == 0) {
            System.out.println("Numero PAR!");
        } else {
            System.out.println("Numero IMPAR!");
        }
    }
    
}
