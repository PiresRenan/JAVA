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
     * Complete the 'weightedMean' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY X
     *  2. INTEGER_ARRAY W
     

    public static void weightedMean(List<Integer> X, List<Integer> W) {
    // Write your code here

    }

}

public class Question12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> vals = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> weights = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.weightedMean(vals, weights);

        bufferedReader.close();
        
    }
}*/

/*
              Objective
In the previous challenge, we calculated a mean. In this challenge, we practice 
calculating a weighted mean. Check out the Tutorial tab for learning materials 
and an instructional video!

              Task
Given an array, X, of N 0integers and an array, W, representing the respective 
weights of X's elements, calculate and print the weighted mean of X's elements. 
Your answer should be rounded to a scale of 1 decimal place (i.e., 12.3 format).
              Example
X = [1,2,3]
W = [5,6,7]             
The array of values X[i]*W[i] = [5,12,21]. Their sum is 38. The sum of W = 18. 
The weighted mean is 38/18 = 2.11111... Print 2.1 and return.
             Function Description
Complete the weightedMean function in the editor below.
weightedMean has the following parameters:
- int X[N]: an array of values
- int W[N]: an array of weights
             Prints
- float: the weighted mean to one decimal place
             Input Format
The first line contains an integer, N, the number of elements in arrays X and W.
The second line contains N space-separated integers that descdribe the elements of 
array X.
The third line contains N space-separated integers that descdribe the elements of 
array W.
             Constraints
- 5 <= N <= 50
- 0 < X[i] <= 100, where X[i]is the i^th element of array X.
- 0 < W[i] <= 100, where W[i]is the i^th element of array W.
             Output Format
Print the weighted mean on a new line. Your answer should be rounded to a scale of
1 decimal place(i.e.,12.3 format).
             Sample Input

STDIN           Function
-----           --------
5               X[] and W[] size n = 5
10 40 30 50 20  X = [10, 40, 30, 50, 20]  
1 2 3 4 5       W = [1, 2, 3, 4, 5]
            Sample Output
32.0
             Explanation
We use the following formula to calculate the weighted mean:
Mw = ∑^N-1,i=0(xi*wi)/∑^N-1,i=0 wi => 10*1 + 40*2 + 30*3 + 50*4 + 20*5/1+2+3+4+5 = 480/15 = 32.0
And then print our result to a scale of 1 decimal place (32.0) on a new line.
*/