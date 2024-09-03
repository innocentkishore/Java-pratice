import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = false;
        if(number<=1){
            System.out.println("Not a prime number");
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if (number % i == 0) {
                isPrime = true;
               // break;
            }
        }
        if(!isPrime){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not a prime number");
        }
    }
}
