package week10.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuizQuestion1 {

    public static void main(String[] args) {
//        Integer[] fibs = new Integer[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
//        List<Integer> fibList = Arrays.asList(fibs);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<12; i++){
            list.add((int)(Math.random()*6000));
        }

        System.out.println(list);

        Collections.sort(list,(a,b) -> {
                    if(a < b){
                        return -1;
                    }else if(a > b){
                        return 1;
                    }else{
                        return 0;
                    }
                });

        System.out.println(list);

    }




}
