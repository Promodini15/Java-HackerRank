import java.io.*;
import java.util.*;
public class Solution {
  static int b,h;
  static boolean flag=false;
    static{
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int h=sc.nextInt();       
              if(b>0 && h>0){
                flag =true;
              }
              else{
                  System.out.println("java.lang.Exception: Breadth and height must be positive");
              }      
    }
  public static void main(String[] args) {
    if(flag){
      System.out.println(b*h);
}
  }
}
