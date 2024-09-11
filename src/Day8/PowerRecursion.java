package Day8;

public class PowerRecursion {
    public static int pow(int a, int b){
        if(b==0){
            return 1;
        }
      //  System.out.println(a);


        return a*pow(a,b-1);
    }
    public static void main(String[] args) {
        System.out.println(pow(5,3));
    }
}
