package InheretencePractise;

public class Programmer extends Person{
    boolean hasAPc = true;

    public Programmer() {
        System.out.println("Programmer constructed !");
    }
    @Override
    public void talk(){
        System.out.println("I am a programmer");
    }
}
