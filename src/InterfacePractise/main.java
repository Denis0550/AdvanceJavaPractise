package InterfacePractise;

public class main {
    public static void main(String[] args) {
        English person1 = new English();
        person1.sayGreetings();

        German person2 = new German();
        person2.sayGreetings();

        System.out.println(person1.sayGreetings());
        System.out.println(person2.sayGreetings());

    }
}
