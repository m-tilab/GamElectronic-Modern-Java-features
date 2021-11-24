package chap0.method_refrence;

@FunctionalInterface
public interface StartsWithFunctionalInterface<F, T> {

    T startsWith(F from);
}
