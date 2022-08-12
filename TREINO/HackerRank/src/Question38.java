import java.io.*;

public class Question38 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(rd.readLine());
		rd.close();
		
		String s = Integer.toBinaryString(n);
		
		n = 0 ;
		for(int i = 0, a = 0; i < s.length() ; i++) {
			if(s.charAt(i) == '1') {
				a++;
			}else {
				a=0;
			}
			if(a > n) {
				n = a;
			}
		}
		
		System.out.print(n);
		
	}
}
/*
       Task
Given a base-10 integer, n, convert it to binary (base-2). Then find and
print the base-10 integer denoting the maximum number of consecutive 1's
in n's binary representation. When working with different bases, it is 
common to show the base as a subscript.
       Example
 n = 125
The binary representation of 125base10 is 1111101base2. In base 10, there 
are 5 and 1 consecutive ones in two groups. Print the maximum, 5.
       Input Format
A single integer, n.
       Constraints
 - 1 <= n <= 10^6
       Output Format
Print a single base-10 integer that denotes the maximum number of consecutive
1's in the binary representation of n.
       Sample Input 1
5
       Sample Output 1
1
       Sample Input 2
13
       Sample Output 2
2
       Explanation
Sample Case 1:
The binary representation of 5base10 is 101base2, so the maximum number of 
consecutive 1's is 1.
Sample Case 2:
The binary representation of 13base10 is 1101base2, so the maximum number 
of consecutive 1's is 2.
*/