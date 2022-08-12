import java.io.*;
import java.util.*;

public class Question15 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
         * Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	int start = sc.nextInt() , end = sc.nextInt();
    	for(int i = start ; i < end ; i++) {
    		System.out.print(s.charAt(i));
    	}
    }
}
/*
Given a string, s, and two indices, start and end, print a substring consisting of 
all characters in the inclusive range from start to end-1. You'll find the String 
class' substring method helpful in completing this challenge.
         Input Format
The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values
of start and end.
         Constraints
- 1 <= |s| <= 100
- 0 <= start < end <= n
String s consists of English alphabetic letters (i.e.,a-zA-Z) only.
         Output Format
Print the substring in the inclusive range from start to end-1.
         Sample Input
Helloworld
3 7
         Sample Output
lowo
         Explanation
In the diagram below, the substring is highlighted in green:
            |0|1|2|3*|4*|5*|6*|7|8|9|
            |H|E|L|L*|O*|W*|O*|R|L|D|
*/