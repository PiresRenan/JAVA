package JAVA_LOOPS;
import java.util.Scanner;

class NumberReverse {

    public static void main(String args[]) {
        int num = 0;
        int reversenum = 0;
        System.out.println("Coloque um numero e aperte enter: ");
        //This statement will capture the user input
        Scanner in = new Scanner(System.in);
        //Captured input would be stored in number num
        num = in.nextInt();
        //While Loop: Logic to find out the reverse number
        in.close();
        while (num != 0) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }

        System.out.println("O inverso do numero digitado é: " + reversenum);
    }
}