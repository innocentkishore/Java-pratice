package Day3;

public class LargeElement
{
    public static void main(String[] args) {
        int []a={4,3,2,6,3};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
