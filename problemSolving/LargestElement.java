package problemSolving;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // size of array
        System.out.println("enter the number of element in a array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // arr formation

        System.out.println("Enter the element of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + max);
        sc.close();

    }

}
