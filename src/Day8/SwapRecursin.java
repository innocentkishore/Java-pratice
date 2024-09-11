package Day8;

import java.util.Arrays;

public class SwapRecursin {

    public static void swap(int []arr, int left, int right){
        if (left>=right){
            return;
        }



            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            swap(arr,left+1,right-1);
       // return arr;
        //return null;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int left=2;
        int right=5;
        swap(arr, left, right);

        for(int i:arr){
            System.out.println(i);
        }
    }
}
