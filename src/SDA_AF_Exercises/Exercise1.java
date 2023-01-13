package SDA_AF_Exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int revN = 0;
        while (n != 0) {
            revN = revN * 10;
            revN = revN + n % 10;
            n = n / 10;
        }
        System.out.println("Your reverse number is...." + revN);

    }
}
