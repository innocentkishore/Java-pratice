public class ArraySwaps {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
      

        int temp=0;
        temp=a[0];
        a[0]=a[a.length-1];
        a[a.length-1]=temp;

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    
}
