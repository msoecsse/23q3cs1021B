package week9.functional;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<String, Integer> f = s -> s.length();

        System.out.println(f.apply("The quick brown fox jumped over the lazy Dog"));

    }

}
