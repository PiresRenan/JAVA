import java.util.*;

public class Question42 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	int size = sc.nextInt();
    	int[] _elements = new int[size];
    	int maximumDifference = 0;
    	for(int i = 0 ; i < size ; i++) {
    		_elements[i] = sc.nextInt();
    	}
    	sc.close();
    	
    	for(int i = 0, temp = 0 ; i < size ; i++ ) {
    		for(int j = 0 ; j < size ; j++) {
    			if(_elements[i] < _elements[j]) {
					temp = _elements[i];
					_elements[i] = _elements[j];
					_elements[j] = temp;
				}
				if((_elements[i] - _elements[j]) > maximumDifference) {
					maximumDifference = _elements[i] - _elements[j];
				}
    		}
    	}
    	
    	System.out.println(maximumDifference);
    }
}

/*
       Objective
Today we're discussing scope. Check out the Tutorial tab for learning materials and an instructional video!
The absolute difference between two integers, a and b, is written as |a-b|. The maximum absolute difference 
between two integers in a set of positive integers, elements,is the largest absolute difference between any 
two integers in _elements.
The Difference class is started for you in the editor. It has a private integer array (elements) for storing 
N non-negative integers, and a public integer (maximumDifference) for storing the maximum absolute difference.
       Task
Complete the Difference class by writing the following:
 - A class constructor that takes an array of integers as a parameter and saves it to the _elements instance 
variable.
 - A computeDifference method that finds the maximum absolute difference between any 2 numbers in _elements 
and stores it in the maximumDifference instance variable.
       Input Format
You are not responsible for reading any input from stdin. The locked Solution class in the editor reads in 2
lines of input. The first line contains N, the size of the elements array. The second line has N space-separated 
integers that describe the _elements array.
       Constraints
 - 1 <= N <= 10      
 - 1 <= _elements[i] <= 100, where 0 <= i <= N - 1
       Output Format
You are not responsible for printing any output; the Solution class will print the value of the maximumDifference 
instance variable.
       Sample Input
STDIN   Function
-----   --------
3       __elements[] size N = 3
1 2 5   __elements = [1, 2, 5]
       Sample Output
4
       Explanation
The scope of the _elements array and maximumDifference integer is the entire class instance. The class constructor 
saves the argument passed to the constructor as the _elements instance variable (where the computeDifference method
can access it).
To find the maximum difference, computeDifference checks each element in the array and finds the maximum difference 
between any 2 elements:
|1 - 2| = 1
|1 - 5| = 4
|2 - 5| = 3
The maximum of these differences is 4, so it saves the value 4 as the maximumDifference instance variable. The locked
stub code in the editor then prints the value stored as maximumDifference, which is 4.
*/