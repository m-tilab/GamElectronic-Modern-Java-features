package chap0.functional_interface2;

import chap0.default_package.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionalInterfaceUsage {

    public static void main(String[] args) {


        Consumer<Integer> intConsumer = (value) -> System.out.println(value + 1);

        List l = null;

        Predicate checkForNull = value -> value != null;

        System.out.println(checkForNull.test(l));

        UnaryOperator<Integer> increase = integer -> integer + 1;

        UnaryOperator<Student> studentUnaryOperator = student -> {

            student.setFirstname("MR " + student.getFirstname());

            return student;
        };

        BinaryOperator<Integer> sum = (a , b) -> a + b;

        Supplier<Double> randomNumber = () -> Math.random();

        System.out.println(randomNumber.get());

    }
}
