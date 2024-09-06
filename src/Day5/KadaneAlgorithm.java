package Day5;

public class  KadaneAlgorithm {
    public static void main(String[] args) {
        int []a={-2,1,-3,4,-1,2,1,-5,4};
        int max=a[0];
        int s=a[0];

        for(int i=1;i<a.length;i++){
          max=Math.max(a[i],a[i]+max);
          s=Math.max(s,max);

        }
        System.out.println(s);
    }
}
