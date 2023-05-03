package week8.printerwriterexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriterDriverwithOptions {

    public static void main(String[] args) {
        File file = new File("src/week8/printerwriterexample/numbers.txt");

        PrintWriter writer;

        try{
            writer = new PrintWriter(file);

            for(int i = 1; i<10_001; i++){
                writer.print(i + ",");
                if(i%4 == 0){
                    writer.print("\n");
                }
            }

            writer.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }


    }




}
