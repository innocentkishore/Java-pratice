package Day7;

public class Sample2Recursion {
    public static int rev(int n) {
        if(n==1) {
            return n;
        }
        System.out.println(n);
        return rev(n-1);
    }
    public static void main(String[] args) {
        System.out.println(rev(5));
    }
}
