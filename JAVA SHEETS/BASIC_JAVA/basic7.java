package BASIC_JAVA;
import java.util.Scanner;
public class basic7 {
    public static void main(String[] args) {
        double num1 , num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero : ");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero : ");
        num2 = scanner.nextDouble();

        System.out.println("Escolha um operador (+ , - , * , /) :");
        char operador = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch (operador) {
            case '+' :
                output = num1 + num2 ;
                break;

            case '-' :
                output = num1 - num2 ;
                break;

            case '*' :
                output = num1 * num2 ;
                break;
                
            case '/' :
                output = num1 / num2 ;
                break;     
        
            default:
                System.out.println("Você digitou um operador invalido, tente novamente.");
                return;
        }
        System.out.println(num1 +" " + operador + " " + num2 + "= " + output);
    }
}