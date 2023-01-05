package CodeWars;

public class FindTheParityOutlier {


    /*
    You are given an array (which will have a length of at least 3, but could be very large)
    containing integers. The array is either entirely composed of odd integers or entirely composed
    of even integers except for a single integer N. Write a method that takes the array as an argument
    and returns this "outlier" N.

    Examples
    [2, 4, 0, 100, 4, 11, 2602, 36]
    Should return: 11 (the only odd number)

    [160, 3, 1719, 19, 11, 13, -21]
    Should return: 160 (the only even number)
    */

    static int find(int[] integers){
        int odd = 0;
        int even = 0;
        int outlier = 0;

        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if (even > odd) {
            for (int num : integers) {
                if (num % 2 != 0) {
                    outlier =  num;
                }
            }
        } else {
            for (int num : integers) {
                if (num % 2 == 0) {
                    outlier =  num;
                }
            }
        }
        return outlier;
    }

    public static void main(String[] args) {

    }
}


