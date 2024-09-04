
import java.util.Arrays;

class RemoveDuplicate{
    public static void main(String[] args) {
        int [] a={3,3,5,6,7};
        Arrays.sort(a);
        int k=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                a[k++]=a[i];
            }

        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}