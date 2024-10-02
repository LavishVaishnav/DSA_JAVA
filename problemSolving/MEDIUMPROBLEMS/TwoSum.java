package problemSolving.MEDIUMPROBLEMS;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target: ");
        int target = sc.nextInt();

        int[] res = SUM(arr, target);
        if (res[0] == -1) {
            System.out.println("No two sum solution found.");
        } else {
            System.out.println("Indices: " + res[0] + ", " + res[1]);
        }
        sc.close();
    }

    public static int[] SUM(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };

    }
}
