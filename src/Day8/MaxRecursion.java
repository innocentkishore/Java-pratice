package Day8;

public class MaxRecursion {
    public  static int max(int []arr,int left,int right){
        if(left==right){
            return arr[left];
        }

        int mid=(left+right)/2;
        int maxleft=max(arr,left,mid);
       int  maxright=max(arr,mid+1,right);

        return Math.max(maxleft,maxright
        );

    }

    public static void main(String[] args) {
        int []a={3,5,7,2};
        int k=0;
        int max=a[0];
        int result=max(a,0,a.length-1);
        System.out.println(result);

    }
}
