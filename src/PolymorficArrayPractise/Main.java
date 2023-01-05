package PolymorficArrayPractise;

public class Main {
    public static void main(String[] args) {

        Person[] arr1 = new Person[4];

        arr1[0] = new Driver();
        arr1[1] = new Secretary();
        arr1[2] = new Welder();
        arr1[3] = new Teacher();


        for (int i = 0; i < arr1.length; i++) {
            arr1[i].DoWork();
        }






    }
}
