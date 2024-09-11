package Day9;

public class SavePeople {
    public  static  int people(int n,int k){
        if(n==1){
            return 1;
        }
        return(people(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        int safeposition=people(5,3)+1;
        System.out.println(safeposition);
    }
}
