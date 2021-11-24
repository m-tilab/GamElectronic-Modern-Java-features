package chap0.lambda_exp;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpInCollections {

    public static void main(String[] args) {


        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        increaseWithLambda(integers);


    }

    private static List<Integer> apply(List<Integer> integers) {

        List<Integer> increasedInts = new ArrayList<>();

        for (int i : integers) {

            increasedInts.add(i + 1);
        }

        return increasedInts;
    }

    private static void increaseWithLambda(List<Integer> integers) {

        integers.forEach((Integer i) -> System.out.println(i + 1));
    }
}
