package problemSolving.MEDIUMPROBLEMS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of array
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Input: array elements
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int res = findMajority(nums, n);
        if (res != -1) {
            System.out.println("The majority element is: " + res);
        } else {
            System.out.println("The majority element is not found");
        }
        sc.close();
    }

    public static int findMajority(int[] nums, int n) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
