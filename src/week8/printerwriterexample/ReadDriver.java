package week8.printerwriterexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadDriver {

    public static void main(String[] args) {
        File file = new File("src/week8/printerwriterexample/numbers.txt");

        Scanner in = null;

        ArrayList<String> words = new ArrayList<>();

        try{
            in = new Scanner(file);

            while(in.hasNext()){
                words.add(in.nextLine());
            }
            in.close();
        }catch(FileNotFoundException e) {
            System.out.println("Uh OH! This is really descriptive.");
        }finally{
            if(in != null){
                in.close();
            }
        }

        int sum = 0;
        for(String number: words){
            sum += Integer.parseInt(number);
        }

        System.out.println(sum);

    }

}
