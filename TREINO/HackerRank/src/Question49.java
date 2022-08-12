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

/*class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     

    public static List<Integer> reverseArray(List<Integer> a) {
		return a = Collections.sort(a);;
    // Write your code here
    	 
    }

}

public class Question49 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> res = Result.reverseArray(arr);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}*/

/*
An array is a type of data structure that stores elements of the same type in a contiguous 
block of memory. In an array, A, of size N, each memory location has some unique index, i 
(where 0 <= i < N), that can be referenced as A[i] or Ai.
Reverse an array of integers.
Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want 
to skip this.
           Example
 A = [1, 2, 3]
 Return [3, 2, 1].
           Function Description
Complete the function reverseArray in the editor below. 
reverseArray has the following parameter(s):
 - int A[n]: the array to reverse
           Returns
 - int[n]: the reversed array
           Input Format
The first line contains an integer, N, the number of integers in A.
The second line contains N space-separated integers that make up A.
           Constraints
 - 1 <= N <= 10^3
 - 1 <= A[i] <= 10^4, where A[i] is the i^th integer in A. 
           Sample Input 1
Array: arr
1
4
3
2
 
4
1 4 3 2
           Sample Output 1
2 3 4 1
*/