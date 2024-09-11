package Day7;

import java.util.Scanner;

public class BoatSavePeople {
    public static void main(String[] args) {
        int c = 0;
        int l = 0;
        int k = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number of people");
        int a[] = new int[n];
        System.out.println("Enter the limit");
        l = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int right = a.length - 1;
        int sum = 0;
        int left = 0;
        while (left <= right) {
            if (a[left] + a[right] <= l) {
                left++;
            }
            right--;
            c++;

        }
        System.out.println("Minimum"+c);

    }

}

