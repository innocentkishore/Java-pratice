package Day7;

public class FactRecursion {

    public static int fact(int n) {
        if(n == 0 || n == 1)
            return 1;
        else {
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.print(fact(5));
    }
}
