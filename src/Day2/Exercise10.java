package Day2;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp=0;
        tmp=a;
        a=b;
        b=tmp;
        System.out.println(a);
        System.out.println(b);
    }
}       
