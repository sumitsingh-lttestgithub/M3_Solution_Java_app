import java.io.*;
import java.util.*;
import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String x=sc.next();

        String y=sc.next();

        /* Enter code here. Print output to STDOUT. */

        int len_x = x.length();

        int len_y = y.length();

        
        System.out.print(((x.substring(0,1)).toUpperCase()+(x.substring(1,len_x).toLowerCase()))+" "+ 
                          ((y.toUpperCase())));
    }
}