package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TEST {
    public static void main(String[] args) {
        int maxOccurrences = 2;
        int [] arr1 = new int[] {1,2,3,1,2,1,2,3};

        List<Integer> tempArrList = new ArrayList<>();

        for(int x : arr1) {
            tempArrList.add(x);
        }

//        System.out.println(tempArrList.get(2));
//        System.out.println(tempArrList.get(7));

        System.out.println("#######################1");
        System.out.println(tempArrList);
        System.out.println(tempArrList.size());

        for (int i = 0; i < tempArrList.size(); i++) {
            int count = 0;
            for (int j = 0; j < tempArrList.size(); j++) {
                if (tempArrList.get(i) == tempArrList.get(j)) {
                    count++;
                }
                if (tempArrList.get(i) == tempArrList.get(j) && count > maxOccurrences) {
//                    tempArrList.set(j,0);
                  tempArrList.remove(j);
                }
            }
        }

        System.out.println("#######################2");
        System.out.println(tempArrList);
        System.out.println(tempArrList.size());

        int[] output = new int[tempArrList.size()];
//        for(int y: tempArrList) {
//            output[y] = tempArrList.get(y);
//        }

        for (int i = 0; i < tempArrList.size(); i++) {
            output[i] = tempArrList.get(i);
        }

        System.out.println("#######################3");
        System.out.println(Arrays.toString(output));


        //result must be : [1,2,3,1,2,3]


    }
}
