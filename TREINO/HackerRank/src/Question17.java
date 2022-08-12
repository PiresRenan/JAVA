import java.util.*;

public class Question17 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. 
         * Print output to STDOUT. Your class should be 
         * named Solution. */
    	Scanner sc = new Scanner(System.in);
    	String A = sc.next();
    	String reversed = "";
    	
    	for(int i = A.length() ; i > 0 ; i--) {
    		reversed = reversed + A.charAt(i-1);
    	}
    	System.out.print(A.compareTo(reversed)>0? "No":"Yes");
    }
}
/*
A palindrome is a word, phrase, number, or other sequence of
characters which reads the same backward or forward.
Given a string A, print Yes if it is a palindrome, print No 
otherwise.
        Constraints
A will consist at most 50 lower case english letters.
        Sample Input
madam
        Sample Output
Yes
*/