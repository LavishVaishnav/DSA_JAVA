package problemSolving;

import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number N (size of array + 1): ");
        int N = sc.nextInt();

        int[] arr = new int[N - 1];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int missingNumber = findMissingNumber(arr, N);

        System.out.println("The missing number is: " + missingNumber);

        sc.close();
    }

    public static int findMissingNumber(int[] arr, int N) {
        for (int i = 1; i < N; i++) {
            boolean isfound = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    isfound = true;
                    break;
                }
            }
            if (!isfound) {
                return i;
            }
        }
        return -1;

    }

}
