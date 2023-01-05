package SDA_Refection_API_Tasks;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Methods: ");
        Method[] methods = student.getClass().getDeclaredMethods();
        System.out.println(Arrays.toString(methods));

        System.out.println("Fields: ");
        Field[] fields = student.getClass().getDeclaredFields();
        System.out.println(Arrays.toString(fields));

        System.out.println("Constructors: ");
        Constructor[] constructors = student.getClass().getConstructors();
        System.out.println(Arrays.asList(constructors));
    }
}


class Student {
    private String name;
    private String lastName;
    private int index;
    private String typeOfStudies;

    public Student() {
    }

    public Student(String name, String lastName, int index, String typeOfStudies) {
        this.name = name;
        this.lastName = lastName;
        this.index = index;
        this.typeOfStudies = typeOfStudies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTypeOfStudies() {
        return typeOfStudies;
    }

    public void setTypeOfStudies(String typeOfStudies) {
        this.typeOfStudies = typeOfStudies;
    }
}
