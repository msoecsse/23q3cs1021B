package week2;

import java.util.Arrays;
import java.util.List;

public class ArrayDriver {

    public static void main(String[] args) {

        String[] a = new String[3];

        a[0] = "0";
        a[1] = "1";
        a[2] = "2";

        List<String> list = Arrays.asList(a);

        String[] temp = adder("1", "2", "3");

        list = Arrays.asList(temp);

    }

    public static String[] adder(String... phrase){
        return phrase;
    }


}
