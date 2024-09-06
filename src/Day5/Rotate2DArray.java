package Day5;

import java.util.Scanner;

public class Rotate2DArray {
    public static void main(String[] args) {
        int [][]a=new int[4][4];
        int k=3;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++){
                a[i][j]=sc.nextInt();

            }
        }
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++){
                System.out.print(a[i][j]+" ");

            }
            System.out.println("\n");
        }
        for (int i=0;i<4;i++)
        {


            for (int j=i+1;j<4;j++){
                if(i!=j){
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }

            }
        }

        System.out.println("Before");
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++){
                System.out.print(a[i][j]+" ");

            }
            System.out.println("\n");
        }
int d=0;
        int col=4-1;
        for (int i=0;i<4;i++){
           // for (int j=0;j<1;j++){
               // if(j!=1) {
                    int temp=a[i][d];
                    a[i][d]=a[i][d+col];
                    a[i][d+col]=temp;
                //}
          //  }
        }

        System.out.println("Final Answer");
        for (int i=0;i<4;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println("\n");
        }
    }
}
