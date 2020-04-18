import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int j = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s =Integer.toBinaryString(j);
        List<Integer> ee = new ArrayList<>();
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            char z = s.charAt(i);
            if(z=='1'){
               count++; 
             }
            else {
                ee.add(count);
                count = 0;
            }
        }
        ee.add(count);
        int min = 0; 
        for (int i : ee) { 
            if (min < i) { 
                min = i; 
            } 
        } 
        System.out.println(min);
        scan.close();
    }
}
