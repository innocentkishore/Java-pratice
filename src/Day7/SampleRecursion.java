package Day7;

public class SampleRecursion {

    public static void add(int n){
        if(n>0) {
            //System.out.println(n);
            add(n-1);
            System.out.println(n);
        }


    }
    public static void main(String[] args) {
        add(5);
    }
}
