package JAVA_LOOPS;
public class MMCcalculadora {
    public static void main(String[] args) {
       int x = 12, y = 8, mmc = 1;

        for (int i = 1 ; i <= x && i <= y ; i++) {
            if (x % i == 0 && y % i == 0) {
                mmc = i;
            }
        } 
        
        System.out.printf("MMC de %d e %d é : %d", x, y, mmc);
    }
}
