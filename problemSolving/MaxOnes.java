package problemSolving;

import java.util.Scanner;

public class MaxOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of the array
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Input: array elements (only 0's and 1's)
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array (only 0's and 1's): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int res = findmaxones(nums);
        System.out.println("Max len is: " + res);
        sc.close();

    }

    public static int findmaxones(int[] nums) {
        int maxi = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxi = Math.max(maxi, count);
                count = 0;

            }
        }
        maxi = Math.max(maxi, count);
        return maxi;
    }

}
