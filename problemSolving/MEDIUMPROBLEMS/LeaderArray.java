package problemSolving.MEDIUMPROBLEMS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeaderArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of the array
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Input: array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and print the leaders in the array
        findLeaders(arr, n);

        sc.close();
    }

    public static void findLeaders(int[] arr, int n) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxi = arr[n - 1];
        leaders.add(maxi);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxi) {
                maxi = arr[i];
                leaders.add(maxi);

            }
        }
        Collections.reverse(leaders);
        System.out.println("Leaders in the array:");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }
}
