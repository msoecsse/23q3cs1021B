package finalcountdown;

import java.util.ArrayList;

public class FoobarDriver {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<10; i++){
        list.add((int)(100*Math.random()));
        }

        System.out.println("i:" + list.get(0));
        System.out.println("i:" + list.get(1));

        printOut(list, (i,j) -> "" + i + j);
        printOut(list, (i,j) -> "" + i + " something else " + j);
    }

    private static void printOut(ArrayList<Integer> l, Foobar f){

        System.out.println(f.bar(l.get(0), l.get(2)));


    }


}
