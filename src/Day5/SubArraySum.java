package Day5;

import java.util.Arrays;

public class SubArraySum {
    public static int[] prefix(int []a){
        int n=a.length;
        int []prefix=new int[n];
        prefix[0]=a[0];
       for(int i=1;i<n;i++){
           prefix[i]=prefix[i-1]+a[i];
       }

        return prefix;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(prefix(a)));

    }
}
