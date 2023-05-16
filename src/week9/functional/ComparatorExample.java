package week9.functional;

import java.util.Comparator;

public class ComparatorExample {

    public static void main(String[] args) {

        Comparator<Integer> c = (i,j) ->{
            if(i < j){
                return 1;
            }else if(i > j){
                return -1;
            }else{
                return 0;
            }
        };

        System.out.println(c.compare(4,4));


    }

}
