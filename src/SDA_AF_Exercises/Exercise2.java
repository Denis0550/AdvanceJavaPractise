package SDA_AF_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("How many numbers ?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Inter numbers....");

        for (int i = 0; i < n; i++) {
            int tempVar = scanner.nextInt();
            arr[i] = tempVar;
        }
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(arr));

        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        System.out.println("Array after sorting sorting: ");
        System.out.println(Arrays.toString(arr));

    }

}
