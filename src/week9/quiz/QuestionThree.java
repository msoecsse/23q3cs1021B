package week9.quiz;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionThree {

    public static void main(String[] args) {

        File file = new File("src/week9/quiz/numbers.csv");

        ArrayList<String> list = new ArrayList<>();

        try(Scanner in = new Scanner(file)){
            while(in.hasNextLine()){
                list.add(in.nextLine());
            }
        }catch(IOException e){
            System.out.println(e);
        }

        int sum = 0;
        for(String line: list){
            String[] elements = line.split(",");
            sum+=Integer.parseInt(elements[1]);
        }

        System.out.println(sum);


    }

}
