package chap0.functional_interface;

public class SumUsage {

    public static void main(String[] args) {


        SumFunctionalInterface sumFunctionalInterface = (a, b) -> {
            return a + b;
        };

        // lambda exp without args
        // () -> a + b

        // Lambda with one args
        //a -> a + b

        // Lambda multiline
        // a -> {
        //  return a + b;
        // }

        System.out.println(sumFunctionalInterface.sum(10 , 20));
    }
}
