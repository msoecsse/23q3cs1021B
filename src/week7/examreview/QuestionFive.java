package week7.examreview;

import java.util.Scanner;

public class QuestionFive {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try{
            one(in.next(),in.next());
        }catch(NumberFormatException e){
            System.out.println("Must enter int");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Need longer word");
        }
        System.out.println("Bye bye");
        in.close();

    }

    private static void one(String word, String number){
        int times = Integer.parseInt(number);
        for(int i = 0; i<times; i++){
            two(word.substring(i));
        }
    }

    private static void two(String substring){
        System.out.println(substring + ": " + substring.length());
    }
}
