package JAVA_FUNCTIONS;
//Numeros primos são maiores que 1 e divisiveis por 1 ou ele mesmo, apenas.

public class PrimeNumbers {

    static void checkPrime(int n){
        int i , m = 0 , flag = 0 ;
        m = n / 2 ;
        if (n == 0 || n == 1) {
            System.out.println(n + " não é numero primo!");
        } else {
            for (i = 2 ; i <= m ; i++) {
                if (n % i == 0) {
                    System.out.println(n + " não é numero primo!");
                    flag = 1;
                    break ;
                }
            }
            if (flag == 0) {
                System.out.println(n + " é numero primo!");
            }
        } 
    }
    public static void main(String[] args) {
        checkPrime(1);
        checkPrime(3);
        checkPrime(17);
        checkPrime(20);
    }
}
