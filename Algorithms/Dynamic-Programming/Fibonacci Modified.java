import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//HACKERRANK DYNAMIC PROGRAM FIBONACCI MODIFIED
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,n;
        long term=0;
        a=sc.nextInt();
        b=sc.nextInt();
        n=sc.nextInt();
        BigInteger t1,t2,t3,t4;
        t1=new BigInteger("0");
        t2=new BigInteger("1");
        if(a==0){
            t1=new BigInteger("0");
        }
        if(a==1){
            t1=new BigInteger("1");
        }
        if(a==2){
            t1=new BigInteger("2");
        }
        
        if(b==0){
            t2=new BigInteger("0");
        }
        if(b==1){
            t2=new BigInteger("1");
        }
        if(b==2){
            t2=new BigInteger("2");
        }
        t4=new BigInteger("0");
        for(int i=2;i<n;i++){
            t3=t2.multiply(t2);
            t4=t1.add(t3);
            t1=t2;
            t2=t4;
            
        }
        String ans=""+t4;
        
        System.out.println(ans);
    }
}
