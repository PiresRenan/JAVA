import java.io.*;

public class Question35 {

	public static void main(String[] args)throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine().trim());
		reader.close();
		System.out.print(factorial(n));
	}

	public static int factorial(int n) {
		for(int i = n - 1 ; i > 0 ; i--) {
			n = n * i;
		}
		return n ;
	}
}
/*
        Recursive Method for Calculating Factorial
factorial(N) = {1 / N * factorial(N-1)   N<=1 otherwise
        Function Description
Complete the factorial function in the editor below. Be sure to use recursion.
factorial has the following paramter:
    int n: an integer
        Returns
 - int: the factorial of n
Note: If you fail to use recursion or fail to name your recursive function factorial
or Factorial, you will get a score of 0.
        Input Format
A single integer, n(the argument to pass to factorial).
        Constraints
 - 2 <= n <= 12 
 - Your submission must contain a recursive function named factorial.
        Sample Input
3
        Sample Output
6
        Explanation

Consider the following steps. After the recursive calls from step 1 to 3, results are 
accumulated from step 3 to 1.
1. factorial(3) = 3 * factorial(2) = 3 * 2 = 6
2. factorial(2) = 2 * factorial(1) = 2 * 1 = 2
3. factorial(1) = 1
*/