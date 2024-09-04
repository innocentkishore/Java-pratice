package Day3;

public class CountEven {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int c=0;
        for (int i=0;i<a.length;i++){
            if(a[i]%2==0){
               c++;
            }
        }
        System.out.println(c);
    }
}
