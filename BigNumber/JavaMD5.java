import java.io.*;
import java.util.*;
import javax.xml.bind.DatatypeConverter;
import java.security.*;
public class Solution {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
   byte b[]=str.getBytes();
   try{
   MessageDigest md= MessageDigest.getInstance("MD5");
   md.update(b);
   System.out.println(DatatypeConverter.printHexBinary(md.digest()).toLowerCase());
   }
   catch(NoSuchAlgorithmException e){
       
   }
    }
}
