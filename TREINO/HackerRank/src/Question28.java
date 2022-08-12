import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum_right = 0;
		int sum_left = 0;
		
		if(n != 1) {
			int[][] arr = new int[n][n];
			for(int i = 0, a = n - 1 ; i < n ; i ++) {
				for(int j = 0, b = n -1; j < n ; j++) {
					arr[i][j] = sc.nextInt();
					if(arr[i][j] >= -100 && arr[i][j] <= 100) {
						if(i == j) {
							sum_right = sum_right + arr[i][j];
						}
						if(i+j == a ) {
							sum_left = sum_left + arr[i][j];
						}
					}else {
						break;
					}
				}
			}
			if(sum_right > sum_left) {
				System.out.println(sum_right - sum_left);
			}else {
				System.out.println(sum_left - sum_right);
			}
		}
	}
}
/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix arr is shown below:
1 2 3
4 5 6
9 8 9  
The left-to-right diagonal = 1 + 5 + 9 = 15. The right to left diagonal = 3 + 5 + 9 = 17. 
Their absolute difference is |15-17| = 2.
             Function description
Complete the diagonalDifference function in the editor below.
diagonalDifference takes the following parameter:
 - int arr[n][m]: an array of integers
             Return
 - int: the absolute diagonal difference
             Input Format
The first line contains a single integer, n, the number of rows and columns in the square matrix arr.
Each of the next n lines describes a row, arr[i], and consists of n space-separated integers arr[i][j].
             Constraints
 - -100 <= arr[i][j] <= 100
             Output Format
Return the absolute difference between the sums of the matrix's two diagonals as a single integer.
             Sample Input
3
11  2   4
4   5   6
10  8  -12
             Sample Output
15
             Explanation
The primary diagonal is:
11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4
The secondary diagonal is:
     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15
Note: |x| is the absolute value of x
*/