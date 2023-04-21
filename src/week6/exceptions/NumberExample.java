package week6.exceptions;

import java.util.Scanner;

public class NumberExample {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a = 0.0;
        System.out.println("Hey you! Enter a number!");
        boolean flag = false;

        while(!flag){
            try{
                a = Double.parseDouble(in.nextLine());
                flag = true;
            }catch(NumberFormatException e){
                System.out.println("Please enter an actual number.");
            }
        }




        System.out.println("Hey you entered: " + a);
    }

}
