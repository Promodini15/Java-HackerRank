import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        Locale india=new Locale("en","IN");
        NumberFormat nf3=NumberFormat.getCurrencyInstance(india);
        System.out.println("US: " +nf.format(payment));
        System.out.println("India: " + nf3.format(payment));
        System.out.println("China: " + nf1.format(payment));
        System.out.println("France: " + nf2.format(payment));
    }
}
