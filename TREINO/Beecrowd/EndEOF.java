package Beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class EndEOF {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
       
        while(in.ready()) {
            in.readLine();
        }
    }    
}