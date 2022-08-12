package JAVA_LOOPS;
import java.util.Scanner;

class ReverseNumber {

    public static void main(String args[]) {
        int number =0, reverse = 0;
        System.out.println("Coloque um numero e aperte enter: ");
        //This statement will capture the user input
        Scanner in = new Scanner(System.in);
        //Captured input would be stored in number num
        number = in.nextInt();
        //we have not mentioned the initialization part of the for loop
        in.close();
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("O inverso deste numero é: " + reverse);
    }
}