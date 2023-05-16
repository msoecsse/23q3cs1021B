package week9.functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

        Comparator<String> c = (i,j) ->{
            if(i.charAt(0) < j.charAt(0)){
                return -1;
            }else if(i.charAt(0) > j.charAt(0)){
                return 1;
            }else{
                return 0;
            }
        };

        //System.out.println(c.compare("do","ray"));

        System.out.println(list);

        Collections.sort(list, (i,j) ->{
            return Math.random() > 0.5 ? 1 : -1;
        });

        System.out.println(list);
    }

}
