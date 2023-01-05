package SDA_Refection_API_Tasks;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Exercise2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,IllegalAccessException,
            InvocationTargetException,InstantiationException, NoSuchFieldException {

        StudentExt studentExt = (StudentExt) Class.forName("SDA_Refection_API_Tasks.StudentExt")
                .getConstructor(String.class, String.class, Integer.class, String.class)
                .newInstance("John", "Smith", 10, "It");

        System.out.println(studentExt);

        Field nameField = studentExt.getClass().getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(studentExt, "Johnson");


        Field lastNameField = studentExt.getClass().getDeclaredField("lastName");
        nameField.setAccessible(true);
        nameField.set(studentExt, "Spring");

        String name = (String) studentExt.getClass().getMethod("getName").invoke(studentExt);
        System.out.println(name);

        String lastName = (String) studentExt.getClass().getMethod("getLastName").invoke(studentExt);
        System.out.println(lastName);

        String typesOfStudies = (String) studentExt.getClass().getMethod("getTypeOfStudies").invoke(studentExt);
        System.out.println(typesOfStudies);

        int index = (Integer) studentExt.getClass().getMethod("getIndex").invoke(studentExt);
        System.out.println(index);




    }


}

class StudentExt {
    private String name;
    private String lastName;
    private int index;
    private String typeOfStudies;

    public StudentExt() {
    }

    public StudentExt(String name, String lastName, int index, String typeOfStudies) {
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

    @Override
    public String toString() {
        return "StudentExt{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", index=" + index +
                ", typeOfStudies='" + typeOfStudies + '\'' +
                '}';
    }
}
