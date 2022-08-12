import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Question19 {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        if(N > 0 && N <=100) {
        	if(N % 2 == 0) {
        		if(N > 5 && N <= 20) {
        			System.out.print("Weird");
        		}else {
        			System.out.print("Not Weird");
        		}
        	}else {
        		System.out.print("Weird");
        	}
        }
    }
}

/*
          Task
Given an integer, n, perform the following conditional actions:
- If n is odd, print Weird.
- If n is even and in the inclusive range of 2 to 5, print Not Weird.
- If n is even and in the inclusive range of 6 to 20, print Weird.
- If n is even and greater than 20, print Not Weird.
Complete the stub code provided in your editor to print whether or not
n is weird.
          Input Format
A single line containing a positive integer, n.
          Constraints
- 1 <= n <= 100.          
          Output Format
Print Weird if the number is weird; otherwise, print Not Weird.
          Sample Input 0
3
          Sample Output 0
Weird
          Sample Input 1
24
          Sample Output 1
Not Weird
          Explanation          
Sample Case 0: n = 3
n is odd and odd numbers are weird, so we print Weird.
Sample Case 1: n = 24
n > 20 and n is even, so it is not weird. Thus, we print Not Weird.
*/