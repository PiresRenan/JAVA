

import java.util.Scanner;
public class Question29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		if(N <= 1000 && N >= 1) {
			int[] A = new int[N];
			
			for(int i = 0 ; i < N ; i++) {
				A[i] = sc.nextInt();
				if(A[i] < 1 && A[i] > 10000) {
					i--;
				}
			}
			
			for(int i = N-1 ; i >= 0 ; i--) {
				System.out.print(A[i] + " "); 
				}
		}
	}

}
/*
         Task
Given an array, A, of N integers, print A's elements in reverse order
as a single line of space-separated numbers.
         Example
A = [1,2,3,4]         
Print 4 3 2 1. Each integer is separated by one space.
         Input Format
The first line contains an integer, N(the size of our array).
The second line contains N space-separated integers that describe array
A's elements.
         Constraints
 - 1 <= N <= 1000
 - 1 <= A[i] <= 10000, where A[i] is the Ith integer in the array.
         Output Format
Print the elements of array A in reverse order as a single line of 
space-separated numbers.
         Sample Input
4
1 4 3 2
         Sample Output
2 3 4 1
*/