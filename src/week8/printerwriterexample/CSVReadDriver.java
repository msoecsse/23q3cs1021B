package week8.printerwriterexample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class CSVReadDriver {
    public static void main(String[] args) {

        File file = new File("src/week8/printerwriterexample/numbers.csv");

        List<String> words = null;
        int sum = 0;

        try{
            words = Files.readAllLines(file.toPath());
        }catch(IOException e){
            System.out.println(e);
        }

        String[] line = words.get(0).split(",");
        System.out.println(line.length);
        System.out.println(line[0]);
        System.out.println(line[1]);
        System.out.println(line[2]);
        System.out.println(line[3]);

    }
}
