package week9.datastreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriterDriver {

    public static void main(String[] args) {
        File file = new File("src/week9/datastreams/doc.txt");

        PrintWriter writer;

        try{
            writer = new PrintWriter(file);

            writer.print("123456");

            writer.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }


    }




}
