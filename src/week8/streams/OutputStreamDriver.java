package week8.streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDriver {

    public static void main(String[] args) {

        File file = new File("src/week8/streams/example.bin");

        try(FileOutputStream out = new FileOutputStream(file)){
            out.write(68);
            out.write(101);

        }catch(IOException e){
            System.out.println("You done goofed");
        }



    }

}
