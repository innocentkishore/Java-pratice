package Day6;

public class PointerApporach {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int start=0;
        int target=8;
        int end=a.length-1;
        while (start<end){
            if(a[start]+a[end]==target){
                System.out.println(start+"kk"+end);
                break;


            }
            else if(a[start]+a[end]<target){
                start++;

            }
            else {

                end--;
            }

        }
    }
}
