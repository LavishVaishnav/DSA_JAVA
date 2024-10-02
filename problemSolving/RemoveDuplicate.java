package problemSolving;

import java.util.Scanner;

public class RemoveDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of element in a array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // logic from here

        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println("Number of unique elements: " + (i + 1));

        System.out.println("The array after removing duplicates: ");
        for (int k = 0; k <= i; k++) {
            System.out.println(arr[k] + " ");
        }
        sc.close();

    }

}
