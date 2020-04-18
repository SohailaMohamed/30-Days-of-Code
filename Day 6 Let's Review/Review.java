import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();
        for(int ii=0; ii<j; ii++){
        String s = scan.next();
        String odd="", even="";
        char []c = s.toCharArray();
        for(int i=0; i<c.length; i++) {
            if(i%2==0) {
                even=even+c[i];
            }else {
                odd=odd+c[i];
            }
        }
        System.out.println(even+" "+odd);
        }
        scan.close();
    }
}
