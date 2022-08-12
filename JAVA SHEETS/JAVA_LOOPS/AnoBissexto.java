package JAVA_LOOPS;
import java.util.Scanner;

class AnoBissexto {
    public static void main(String[] args) {
        int year;
        System.out.println("Coloque um ano :");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        sc.close();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "  é ano bissexto.");
        } else {
            System.out.println(year + " NÃO é ano bissexto.");
        }
    }
    
}
