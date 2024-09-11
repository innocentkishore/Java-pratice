package Day6;

public class Equillibrirum {
    public static void main(String[] args) {
        int []a={-2,4,6,4,-2};
        int d=0;
        int left=0;
        int right=0;
        for(int i=0;i<a.length;i++){
            right+=a[i];
        }

        for(int i=0;i<a.length;i++){
            if(left==right-a[i]-left){
                d=i;
            }
            left+=a[i];
        }
        System.out.println(d);
    }
}
