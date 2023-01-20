package SDA_AF_Exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(4);
        listOfIntegers.add(1);
        listOfIntegers.add(6);
        listOfIntegers.add(9);
        listOfIntegers.add(2);


        System.out.println(averageOfList(listOfIntegers));

    }

    public static Double averageOfList (List<Integer> list) {
       return  list.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
    }
}
