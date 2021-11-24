package chap0.functional_interface;

@FunctionalInterface
public interface SumFunctionalInterface {

    int sum(int a, int b);

    //int subtract(int a, int b);

    default int subtract(int a, int b) {
        return a - b;
    }

}
