import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        int t, l1, l2, max, min, flag = 0, j=0;
        int arr[] = new int[26];
        t = sc.nextInt();
        String a, b;
        for (int i=0; i<t; i++){
            flag = 0;
            //g = 0;
        a = sc.next();
        b = sc.next();
        l1 = a.length();
        l2 = b.length();
        if (l1 > l2){
            min = l2;
            max = l1;}
        else{
            min = l1;
            max = l2;}
            for (int k=0; k<26; k++){
                arr[k] = 0;
            }
        //for (int j=0; j<l1; j++){
            for (int k=0; k<l2; k++){
                arr[(int)b.charAt(k)-97] = 1;
                //if (a.charAt(j) == b.charAt(k)){
                  //  flag = 1;
                    //g=1;
                    
                //}
            }
            for (int k=0; k<l1; k++){
                if (arr[(int)a.charAt(k)-97] == 1){
                    flag =1;
                    break;
                }
            }
            //if (g == 1)
                //break;
        
            if (flag == 1){
                System.out.println("YES");
            }
            if (flag == 0){
                System.out.println("NO");
            }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solutionhttp://a4-10334.5-355.cdn13.com/111000/111061/111061.mp4?cdn_hash=8922ed071a1ee4e3dac60049541f0ae7&cdn_creation_time=1463392080&cdn_ttl=900&cdn_bw=492544. */
        }}
}
