package Day9;

public class LongestSubSequence {

    public static int lonSub(int[] arr) {
        int max=1;
        int current=1;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>arr[i-1]){
                current++;
                max=Math.max(max,current);
            }
            else {
                current=1;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,3,4,5,6,7};
        System.out.println(lonSub(a));
    }
}
