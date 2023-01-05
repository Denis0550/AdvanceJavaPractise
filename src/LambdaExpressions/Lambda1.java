package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lambda1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(55);
        numbers.add(35);
        numbers.add(67);
        numbers.add(11);
        numbers.add(55);
        numbers.add(82);


        numbers.forEach(n -> System.out.println(n*10));


        numbers.stream()
                .filter(p -> p > 50)
                .forEach(System.out::println);


        System.out.println("#########################################");

        Stream.iterate(0, n -> n + 1)
                .limit(10)
                .forEach(x -> System.out.println(x));


    }
}
