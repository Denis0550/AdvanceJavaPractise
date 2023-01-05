package InheretencePractise;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(88);                          // superclass
        System.out.println("Is person alive ? " + p.isAlive);
        System.out.println("Persons age: " + p.age);
        p.talk();

        System.out.println("############################################");

        Singer s = new Singer();                                // subclass of Person
        System.out.println("Is person alive ? " + s.isAlive);
        System.out.println("Persons age: " + s.age);
        System.out.println("Band name: " + s.bandName);
        s.talk();
        s.singASong();

        System.out.println("############################################");

        Programmer pr = new Programmer();                        // subclass of Person
        pr.setAge(7);
        System.out.println("Is person alive ? " + pr.isAlive);
        System.out.println("Persons age: " + pr.age);
        System.out.println("Has a pc: " + pr.hasAPc);
        pr.talk();
//        pr.singASong();

        System.out.println("############################################");

        JavaProgrammer jpg = new JavaProgrammer();                // subclass of Programmer class
        jpg.talk();
        System.out.println("Is person alive ? " + jpg.isAlive);
        System.out.println("Persons age: " + jpg.age);


    }


}
