import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner scan = new Scanner(System.in);
        int repeat = scan.nextInt();
        for(int j=0; j<repeat; j++) {
            int n = scan.nextInt();
            int m=n/2;      
            int flag=0;
            if(n==0||n==1){  
                System.out.println("Not prime");      
            }
            else
            {  
                for(int i=2;i<=m;i++){      
                    if(n%i==0){      
                        flag=1;  
                        System.out.println("Not prime"); 
                        break;
                    }
                }      
                if(flag==0)  
                { 
                    System.out.println("Prime"); 
                }  
            }
        }
    }
}


