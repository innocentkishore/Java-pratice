package Day4;

import java.util.Scanner;

public class Array2D {
    public static int maxElement(int[][] a){
        int max = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        return max;


    }
    public  static void rowwise(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println("\n");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]a=new int [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
                for (int j=0;j<3;j++){

                }

        }
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");

        }

        int max=maxElement(a);
        System.out.println(max);
        rowwise(a);

    }
}
