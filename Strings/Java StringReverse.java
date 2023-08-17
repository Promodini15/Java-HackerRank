import java.io.*;
import java.util.*;
public class Solution {
    public static void reverse(String str){
        String s1="";
        for(int i=str.length()-1;i>=0;i--){
            s1+=str.charAt(i);
        }
        if(str.equals(s1)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        reverse(A);       
    }
}



