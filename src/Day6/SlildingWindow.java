package Day6;

public class SlildingWindow {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int start=0;
        int sum=0;
        int window=0;
        int end=3;
        int finamax=0;
        for(int i=start;i<end ;i++){
            sum+=a[i];
            System.out.println("Sum"+sum);

        }
        for(int i=end;i<a.length;i++){
            window+=a[i]-a[i-end];
            sum=Math.max(sum,window);

        }
        System.out.println(sum);
    }
}
