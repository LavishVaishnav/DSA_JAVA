package problemSolving;

import java.util.Scanner;

public class SecondLargest {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt(); // size of array

        if (n < 2) {
            System.out.println("Second largest : -1");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }

        if (secondlargest == Integer.MIN_VALUE) {
            System.out.println("Second Largest: -1");
        } else {
            System.out.println("Second Largest: " + secondlargest);

        }

        sc.close();

    }

}
