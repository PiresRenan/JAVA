package JAVA_LOOPS;
import java.util.Scanner;

class ODDeven {

    public static void main(String args[]) {
        int num;
        System.out.println("Digite um numero inteiro : ");

        //The input provided by user is stored in num
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        /* If number is divisible by 2 then it's an even number
         * else odd number*/
        input.close();
        if (num % 2 == 0)
            System.out.println("O numero digitado é par!");
        else
            System.out.println("O numero digitado é impar!");
    }
}