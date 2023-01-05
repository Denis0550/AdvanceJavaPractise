package Innerclass;

public class OuterClass {
    int number = 6;
    public void heyThere() {
        System.out.println("Hey there!");

        class LocalInnerClass {
            String localInnerClassVariable = "Here is Johnny";

            public void printLocalInnerClassVariable() {
                System.out.println(localInnerClassVariable);
            }
        }
        LocalInnerClass lic = new LocalInnerClass();
        lic.printLocalInnerClassVariable();

    }

    public static class InnerClass {
        int innerNumber = 8;

        public void whatsUp() {
            System.out.println("Whats up from the Inner Class !");
        }
    }

}
