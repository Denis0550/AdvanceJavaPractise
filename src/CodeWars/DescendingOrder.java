package CodeWars;

public class DescendingOrder {

    /*
    Your task is to make a function that can take any non-negative integer as an argument and return
    it with its digits in descending order. Essentially, rearrange the digits to create the highest
    possible number.

    Examples:
    Input: 42145 Output: 54421
    Input: 145263 Output: 654321
    Input: 123456789 Output: 987654321
    */

    public static int sortDesc(final int num) {
        int[] arr = new int[10];
        int num1 = num;
        int digit;
        int sum = 0;

        while (num1 > 0) {
            digit = num1 % 10;
            for (int i = 0; i < 10; i++) {
                if (digit == i) {
                    arr[i]++;
                }
            }
            num1 = num1 / 10;
        }
        num1 = 0;
        for (int i = 9; i >= 0; i--) {
            if (arr[i] != 0) {
                while (arr[i] > 0) {
                    num1 = num1 * 10 + i;
                    arr[i]--;
                }
            }
        }
        return num1;
    }

    public static void main(String[] args) {

        System.out.println(sortDesc(42145));


    }

}
