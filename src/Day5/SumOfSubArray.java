package Day5;

public class SumOfSubArray {
    public static void main(String[] args) {
        int [] arr = {2,8,3,9,6,5,4};
        int sum = 0;
        int i=2;
        int j =5;
        for(int pos = i;pos<=j;pos++){
            sum+=arr[pos];
        }
        System.out.println(sum);
    }
}
