package BASIC_JAVA;
import java.util.Scanner; // necessario para o uso da entrada de dados.
public class basic6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ; /* Criando o scan */

        System.out.println("Digite o primeiro numero :");
        int num1 = scan.nextInt(); /* Usando o scan*/

        System.out.println("Digite o segundo numero :");
        int num2 = scan.nextInt();

        scan.close(); /* Necessario sempre fechar o scan antes de terminar o programa. */

        int produto = num1 * num2 ;

        System.out.println("Produto é : " + produto);
    }
    
}
