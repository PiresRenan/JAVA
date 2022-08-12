import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Question20 {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should 
         * be named Solution. */
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String s = reader.readLine();
    	reader.close();
    	String divisao[] = s.split("[!,?._'@ ]");
    	divisao = Arrays.asList(divisao).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
    	System.out.println(divisao.length);
    	for(String z : divisao) {
    		System.out.println(z);
    	}
    }
}
//System.out.print(4 * Math.pow(10, 5));
//for(int i = 0 ; i < s.length() ; i++) {
	//System.out.print("[" + c[i] + "] ");
//}
/*for(int i = 0 ; i < s.length() ; i++) {
	if() {
		contagem_palavras++;
	}*/
/*
Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. 
We define a token to be one or more consecutive English alphabetic letters. Then, print the number 
of tokens, followed by each token on a new line.
Note: You may find the String.split method helpful in completing this challenge.
           Input Format
A single string, s.
           Constraints
- 1 <= length of s <= 4*10^5 is composed of any of the following: English alphabetic letters, blank 
spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), 
apostrophes ('), and at symbols (@).
           Output Format
On the first line, print an integer, n, denoting the number of tokens in string s(they do not need to 
be unique). Next, print each of n the tokens on a new line in the same order as they appear in input 
string s.
           Sample Input
He is a very very good boy, isn't he?
           Sample Output
10
He
is
a
very
very
good
boy
isn
t
he
           Explanation
We consider a token to be a contiguous segment of alphabetic characters. There are a total of 10
such tokens in string s, and each token is printed in the same order in which it appears in 
string s.
*/