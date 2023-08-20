import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String delim="!, ? . _ ' @";
        StringTokenizer st=new StringTokenizer(s,delim);
        int tokencount=st.countTokens();
        System.out.println(tokencount);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}

