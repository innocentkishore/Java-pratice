package Day7;

public class Sample3Recursion {
   public static int rec(int n){
       if(n==1){
           System.out.println(n);
           System.out.println(n);
           return rec(n+1);
       }
       else {
           System.out.println(n);
           return rec(n-1);

       }
   }
    public static void main(String[] args) {
        System.out.println(rec(5));
    }
}
