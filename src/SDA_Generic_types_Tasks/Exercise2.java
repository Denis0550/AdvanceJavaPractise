package SDA_Generic_types_Tasks;

public class Exercise2 {
    public static void main(String[] args) {
        Integer[] tab = {10, 21, 33, 40, 50, 60};
        int counter = Utils.countIf(tab, new Validator<Integer>() {
            @Override
            public boolean validate(Integer value) {
                return value % 3 == 0;
            }
        });
        System.out.println(counter);
    }
}

interface Validator<T> {
        boolean validate(T value);
}

class Utils {
    public static <T> int countIf(T[] tab, Validator<T> validator) {
        int counter = 0;
        for (T element: tab) {
            if (validator.validate(element)) {
                counter++;
            }
        }
        return counter;
    }
}


