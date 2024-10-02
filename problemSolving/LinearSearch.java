package problemSolving;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of element in a array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        int result = linearsearch(arr, target);

        if (result == -1) {
            System.out.println("Target not found in the array.");
        } else {
            System.out.println("Target found at index: " + result);
        }
        sc.close();

    }

    public static int linearsearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }
}
