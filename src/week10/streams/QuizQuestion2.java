package week10.streams;

import java.util.Arrays;
import java.util.List;

public class QuizQuestion2 {

    public static void main(String[] args) {

        Integer[] fibs = new Integer[]{01, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        List<Integer> fibsList = Arrays.asList(fibs);

        System.out.println( fibsList.stream().filter(i -> i%3==0).
                map(i -> "" + i).filter(s -> s.length() >=2).toList());


    }

}
