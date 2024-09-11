package Day9;

public class MultiplyRecursion {

    public static int mul(int a, int b) {

        if (b == 0){
            return 0;
        }
        if(b>0){
            return a+mul(a, b-1);
        }

            return -mul(a, -b);

    }
    public static void main(String[] args) {
        int a=5;
        int b=4;

            System.out.println(""+mul(a,b));


    }
}
