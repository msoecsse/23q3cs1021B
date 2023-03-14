package week1;

import java.util.Scanner;

public class ScannerDriver {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Hey you! How old are you?");

        double age = in.nextDouble();

        System.out.println("Hey buddy! What is your name?");

        String name = in.nextLine();

        System.out.println(name + "'s age is: " + age);

    }

}
