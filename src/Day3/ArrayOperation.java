

public class ArrayOperation {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int s=0;
        int m=1;
        float c=0;
        for(int i=0;i<a.length;i++){
            s=s+a[i];
            m=m*a[i];

        }
        c=s/a.length;
        System.out.println(s);
        System.out.println(m);
        System.out.println(c);
    }
    
}
