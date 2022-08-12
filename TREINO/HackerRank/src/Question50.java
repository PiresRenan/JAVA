import java.util.Scanner;
public class Question50 {

	static int n = 0;
	static String[] array;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		array = new String[n];
		for(int i = 0 ; i < n ; i++) {
			array[i] = sc.next();
		}
	}

	public void printArray() {
		for(int i = 0 ; i < n ; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
/*
         Task
Write a single generic function named printArray; this function must take an array of generic 
elements as a parameter (the exception to this is C++, which takes a vector). The locked Solution 
class in your editor tests your function.
Note: You must use generics to solve this challenge. Do not write overloaded functions.       
         Input Format
The locked Solution class in your editor will pass different types of arrays to your printArray function.
         Constraints
 - You must have exactly 1 function named printArray.
         Output Format
Your printArray function should print each element of its generic array parameter on a new line.
*/