public class SecondLargest {
    public static void main(String[] args) {
        int []a={3,4,5,6,7,9};
        // int max=a[0];
        // for(int i=0;i<a.length;i++){
        //     if(a[i]>max)
        //     max=a[i];
        // }
        // int second=a[0];
        // for(int i=0;i<a.length;i++){
        //     if(a[i]==max){
        //         continue;
        //     }
        //     else{
        //         if(a[i]>second){
        //             second=a[i];
        //         }
        //     }
        // }
        // System.out.println(second);
        int firstmax=0;
        int secondmax=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>firstmax){
                secondmax=firstmax;
                firstmax=a[i];
            }
            else if(a[i]>firstmax && a[i]<secondmax){
                secondmax=a[i];
            }
        }
        System.out.println(secondmax);
    }
    
}
