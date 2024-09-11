package Day7;

import java.util.Arrays;

public class ProductSubArray {
    public static void main(String[] args) {
        int []a={10,5,2,6};
        Arrays.sort(a);
       int product=1;
       int left=0;
       int k=100;
       int count=0;

       for(int right=0;right<a.length;right++){
           product *= a[right];
           while (product>=k && left<right){
               product /= a[left];
               left++;
           }
           count+=right-left+1;
       }
       System.out.println(count);
    }
}
