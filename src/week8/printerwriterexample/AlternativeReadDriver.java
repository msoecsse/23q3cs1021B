package week8.printerwriterexample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class AlternativeReadDriver {
    public static void main(String[] args) {

        File file = new File("src/week8/printerwriterexample/numbers.txt");

        List<String> words = null;
        int sum = 0;

        try{
            words = Files.readAllLines(file.toPath());
            for(String number: words){
                sum += Integer.parseInt(number);
            }
        }catch(IOException e){
            System.out.println(e);
        }


        System.out.println(sum);

    }
}
