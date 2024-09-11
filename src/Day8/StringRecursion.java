package Day8;

import java.util.Scanner;

public class StringRecursion {
    public static void rec(String str,int i) {
        if (i==str.length()) {
            return;
        }
        System.out.println(str.charAt(i));
        rec(str,i+1);


    }
    public static void main(String[] args) {
        String str="ALGOTUTOR";
        rec(str,0);

    }
}
