package week6.exceptions;

import java.util.IllegalFormatException;
import java.util.Scanner;

public class NumberExample {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        double a = 0.0;
        System.out.println("Hey you! Enter a number!");
        boolean flag = false;

        notNegative(a);

        while(!flag){
            try{
                a = Double.parseDouble(in.nextLine());

                flag = true;
            }catch(NumberFormatException e) {
                System.out.println(e.getLocalizedMessage());
            }finally{

            }
        }

        System.out.println("Hey you entered: " + a);
    }

    private static void notNegative(double d) throws Exception{
        if(d < 0){
            throw new Exception("This is because you didn't follow directions and you entered a negative number.");
        }
    }

}
