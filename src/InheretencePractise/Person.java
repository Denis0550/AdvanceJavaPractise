package InheretencePractise;

public class Person {
    boolean isAlive = true;
    int age;

    public Person() {
        System.out.println("Person constructed !");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
        System.out.println("Constructed person with age");
    }

    public void talk(){
       System.out.println("Humans are ...... ");
   }

}
