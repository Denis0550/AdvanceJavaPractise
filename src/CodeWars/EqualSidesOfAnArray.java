package CodeWars;

public class EqualSidesOfAnArray {

    /*
    You are going to be given an array of integers. Your job is to take that array and find an index N where
    the sum of the integers to the left of N is equal to the sum of the integers to the right of N. If there
    is no index that would make this happen, return -1.
    */

    /*
    Let's say you are given the array {1,2,3,4,3,2,1}:
    Your function will return the index 3, because at the 3rd
    position of the array, the sum of left side of the
    index ({1,2,3}) and the sum of the right side of the index ({3,2,1}) both equal 6.
    */

    public static void main(String[] args) {
        int [] arrX = new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4};

        System.out.println(findEvenIndex(arrX));

    }

    public static int findEvenIndex(int[] arr) {
        int evenIndex = -1;
        int sumF = 0;
        int sumL = 0;
        for (int i = 1; i < arr.length ; i++) {
            sumF = sumF + arr[i];
        }
        if (sumF == 0) {
            evenIndex = 0;
            return evenIndex;
        }
        for (int i = 0; i < arr.length - 1 ; i++) {
            sumL = sumL + arr[i];
        }
        if (sumL == 0){
            evenIndex = arr.length;
            return evenIndex;
        }
        for (int i = 1; i < arr.length ; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 = sum1 + arr[j];
            }
            for (int j = (i + 1); j < arr.length; j++) {
                sum2 = sum2 + arr[j];
            }
            if (sum1 == sum2) {
                evenIndex = i;
            }

        }
        return evenIndex;
    }
}
