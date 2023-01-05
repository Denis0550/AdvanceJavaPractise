package CodeWars;


    /*
    Write a function that accepts an array of 10 integers (between 0 and 9),
    that returns a string of those numbers in the form of a phone number.
    Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
    */

public class Kata1 {
    public static String createPhoneNumber(int[] numbers) {
//        int[] array1 = new int[] {1, 5, 8};
        String output = "(";

        for (int i = 0; i < 3; i++) {
            output = output + String.valueOf(numbers[i]);
        }
        output = output + ") ";

        for (int i = 3; i < 6 ; i++) {
            output = output + String.valueOf(numbers[i]);
        }

        output = output + "-";

        for (int i = 6; i <= 9 ; i++) {
            output = output + String.valueOf(numbers[i]);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String x = createPhoneNumber(arr);
        System.out.println(x);
    }
}


