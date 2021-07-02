package day_0702_lambda.expressions;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferenceEx {

    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;

        function = (a, b) -> a.compareToIgnoreCase(b);
        System.out.println(function.applyAsInt("Java8", "JAVA8"));

        function = String::compareToIgnoreCase;
        System.out.println(function.applyAsInt("Java8", "JAVA8"));
    }
}
