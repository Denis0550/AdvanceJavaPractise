package SDA_AF_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("positive");
        listOfStrings.add("Flower");
        listOfStrings.add("ATB and bta");
        listOfStrings.add("next");

        System.out.println(streamsToUppercase(listOfStrings));

    }


    public static List<String> streamsToUppercase (List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
//                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());

    }
}
