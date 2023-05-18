package week10.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

        List<String> newList = list.stream().filter(s -> s.length() == 3).filter(s -> s.charAt(0) == 'f').toList();

        //newList.stream().forEach

        System.out.println(newList);

    }

}
