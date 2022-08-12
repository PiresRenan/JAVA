import java.io.*;
public class Question31 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(r.readLine());

		for(int i = 0; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(j < n-i-1) {
					System.out.print(' ');
				}else {
					System.out.print('#');
				}
			}
			System.out.println();
		}
	}

}
/*
Staircase detail
This is a staircase of size n = 4:
   #
  ##
 ###
####
Its base and height are both equal to n. It is drawn using # symbols and 
spaces. The last line is not preceded by any spaces.
Write a program that prints a staircase of size n.
        Function Description
Complete the staircase function in the editor below.
staircase has the following parameter(s):
  - int n: an integer
        Print
Print a staircase as described above.
        Input Format
A single integer, n, denoting the size of the staircase.
        Constraints
  0 < n <= 100.
        Output Format
Print a staircase of size n using # symbols and spaces.
Note: The last line must have 0 spaces in it.
        Sample Input
6 
        Sample Output
     # 
    ##
   ###
  ####
 #####
######
        Explanation
The staircase is right-aligned, composed of # symbols and spaces, and has a 
height and width of n = 6.
*/