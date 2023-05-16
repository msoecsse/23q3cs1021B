package week9.functional;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<String> a = s -> s.length()<3;

        System.out.println(a.test("test"));

    }



}
