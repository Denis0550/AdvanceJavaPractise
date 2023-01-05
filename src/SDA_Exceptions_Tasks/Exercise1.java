package SDA_Exceptions_Tasks;

public class Exercise1 {
    public static void main(String[] args) throws CannotDivideBy0Exception {

        MathDivide.divide(10,0);
        System.out.println(MathDivide.divide(10,5));

    }
}

class CannotDivideBy0Exception extends Exception {
    public CannotDivideBy0Exception() {
        super("Can't divide by 0!");
    }
}



class MathDivide {
    public static float divide(int a, int b) throws CannotDivideBy0Exception {
        if (b==0){
            throw new CannotDivideBy0Exception();
        }
        return a / b;
    }
}