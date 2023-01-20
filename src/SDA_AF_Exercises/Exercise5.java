package SDA_AF_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("alfred");
        listOfStrings.add("Aruba");
        listOfStrings.add("abc");
        listOfStrings.add("content");
        listOfStrings.add("jks");
        listOfStrings.add("ask");
        System.out.println(returnAFew(listOfStrings));


    }


    public static List<String> returnAFew (List<String> list) {
        return list.stream()
                .filter(str -> str.charAt(0) == 'a' && str.length() == 3)
//                .filter(s -> s.startsWith("a"))
//                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }

}
