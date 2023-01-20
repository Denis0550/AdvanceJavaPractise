package PreBasics;

//FACTORY
public class InterfaceOjects {
    public static void main(String[] args) {
        MyFamily obj;

        //polymorphic behavior of the interface taking different forms
        obj= new Brother();
        obj.doSomething();

        obj = new Sister();
        obj.doSomething();
    }
}

interface MyFamily{
    void doSomething();
}

class Brother implements MyFamily{
    @Override
    public void doSomething() {
        System.out.println("This is Bro");
    }
}

class Sister implements MyFamily{
    @Override
    public void doSomething() {
        System.out.println("This is SIS");
    }
}