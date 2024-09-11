package Day6;

public class BuyAndSell {
    public static void main(String[] args) {
        int []a={7,1,5,3,6,4};
        int d=0;
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
                d=i;
            }
        }
      //  System.out.println(d);
        int max=a[d];
        for(int i=d;i<a.length;i++){
            if(a[i]>max){
                    max=a[i];
            }

        }
        System.out.println(max-min);
    }
}
