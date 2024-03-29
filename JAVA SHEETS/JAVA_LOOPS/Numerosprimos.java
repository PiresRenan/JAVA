package JAVA_LOOPS;
class Numerosprimos {
    // Function to print first N prime numbers
    static void printPrimeNumbers(int N) {
        // Declare the variables
        int i, j, flag;

        // Print display message
        System.out.println("Prime numbers between 1 and " + N + " are:");

        // Traverse each number from 1 to N
        // with the help of for loop
        for (i = 1; i <= N; i++) {

            // Skip 0 and 1 as they are
            // niether prime nor composite
            if (i == 1 || i == 0)
                continue;

            // flag variable to tell
            // if i is prime or not
            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.print(i + " ");
        }
    }

    // Driver code
    public static void main(String[] args) {
        int num = 100;
        printPrimeNumbers(num);
    }
}