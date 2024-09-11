package Day7;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateInList {
    public  static List<Integer> findDuplicate(int []a){
        List<Integer> list=new ArrayList<>();
        int index=0;
        for(int i=0;i<a.length;i++){
            index=Math.abs(a[i]) - 1;
            if(a[index]<0){
                list.add(index+1);

            }
            a[index]=-a[index];

        }
        return list;
    }
    public static void main(String[] args) {
        int []a={4,3,2,7,8,2,1,3};

       // List<Integer> list1=new ArrayList<>();
       // list1 =
        System.out.println(findDuplicate(a));
    }
}
