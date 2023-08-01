import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        int num=A.compareTo(B);
        if(num>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.print(firstUpperCase(A)+" ");
        System.out.print(firstUpperCase(B));
       
    }
    public static String firstUpperCase(String a){
        if(a==null || a.length()==0){
            return "";
        }
        return a.substring(0,1).toUpperCase()+a.substring(1);
    }
}



