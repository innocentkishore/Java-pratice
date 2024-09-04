package Day2;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int d=a%10;
        if(d%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
