package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DeleteOccurrences {

    /*
    Delete occurrences of an element if it occurs more than n times
    Enough is enough!
    Alice and Bob were on a holiday. Both of them took many pictures of the places they've been, and now they
    want to show Charlie their entire collection. However, Charlie doesn't like these sessions, since the motif
    usually repeats. He isn't fond of seeing the Eiffel tower 40 times.
    He tells them that he will only sit for the session if they show the same motif at most N times. Luckily,
    Alice and Bob are able to encode the motif as a number. Can you help them to remove numbers such that their
    list contains each number only up to N times, without changing the order?

    Task
    Given a list and a number, create a new list that contains each number of list at most N times, without reordering.
    For example if the input number is 2, and the input list is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop
    the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which
    leads to [1,2,3,1,2,3].
    With list [20,37,20,21] and number 1, the result would be [20,37,21].
    */

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if (maxOccurrences == 0) {
            return new int[0];
        }
        List<Integer> tempArrList = new ArrayList<>();

        for(int x : elements) {
            tempArrList.add(x);
        }

        for (int i = 0; i < tempArrList.size(); i++) {
            int count = 0;
            for (int j = 0; j < tempArrList.size(); j++) {
                if (tempArrList.get(i) == tempArrList.get(j)) {
                    count++;
                }
                if (tempArrList.get(i) == tempArrList.get(j) && count > maxOccurrences) {
                    tempArrList.remove(j);
                }
            }
        }

        int[] output = new int[tempArrList.size()];
        for (int i = 0; i < tempArrList.size(); i++) {
            output[i] = tempArrList.get(i);
        }

        return output;
    }

    public static void main(String[] args) {
        int [] arr1 = new int[] {1,2,3,1,2,1,2,3};
        int [] arr2 = new int[] {26, 21, 17, 1, 10, 6, 11, 6, 13, 6, 1, 0, 5, 20, 1, 5, 3, 21, 27, 2, 24, 5, 7, 3, 25, 26, 10, 26};


        deleteNth(arr1, 2);
        System.out.println(Arrays.toString(deleteNth(arr2, 0)));
        System.out.println();

    }
}


