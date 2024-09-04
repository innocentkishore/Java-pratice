package Day3;

import java.util.Arrays;

public class SearchValue {
    public static void main(String[] args) {
        int []a={3,4,5,6,6};
        int b=3;

        int f=1;
        for (int i=0;i<a.length;i++){
            if (a[i]==b){
               // System.out.println("value found");
                f=1;
            }
            else {
                //System.out.println("value not found");
                f=0;
            }
        }
        if(f==0){
            System.out.println(" found");
        }
        else {
            System.out.println(" NOT found");
        }
    }
}
