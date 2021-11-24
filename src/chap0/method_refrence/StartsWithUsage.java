package chap0.method_refrence;

import java.util.function.Function;

public class StartsWithUsage {

    public static void main(String[] args) {

        String name = "IRAN";

        System.out.println(startsWith(name));
        System.out.println(startsWithJava8CustomFunctionalInterface(name));
        System.out.println(startsWithJava8FunctionInterface(name));
        System.out.println(startsWithJava8LambdaExp(name));
        System.out.println(startsWithJava8CustomClassMethodRef(name));
    }

    private static Character startsWith(String name) {

        return StringTools.startsWith(name);
    }

    private static Character startsWithJava8CustomFunctionalInterface(String str) {

        StartsWithFunctionalInterface<Integer, Character> stringCharAtFunction = str::charAt;

        return stringCharAtFunction.startsWith(0);
    }

    private static Character startsWithJava8FunctionInterface(String str) {

        Function<Integer, Character> stringCharAtFunction = str::charAt;

        return stringCharAtFunction.apply(0);
    }

    private static Character startsWithJava8LambdaExp(String str) {

        Function<Integer, Character> stringCharAtFunction = integer -> str.charAt(integer);

        return stringCharAtFunction.apply(0);
    }

    private static Character startsWithJava8CustomClassMethodRef(String str) {

        Function<String, Character> stringCharAtFunction = StringTools::startsWith;

        return stringCharAtFunction.apply(str);
    }
}
