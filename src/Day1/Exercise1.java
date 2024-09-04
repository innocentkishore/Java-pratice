package Day1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int num1=sc.nextInt();
                // int num2=sc.nextInt();
                if(num1>90){
                    System.out.println("Grade A");
                }
                else if(num1>80&&num1<89){
                    System.out.println("Grade B");
                }
                else if(num1>70&&num1<79){
                    System.out.println("Grade C");
                }
                else if(num1>60&&num1<69){
                    System.out.println("Grade D");
                }
                else if(num1<60){
                    System.out.println("Grade E");
                }
            }
        }


