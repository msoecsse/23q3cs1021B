package week10.streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileStream {

    public static void main(String[] args) {

        File file = new File("src/week10/streams/greatestsongintheworld.txt");

        System.out.println(file.exists());

        try{
            long count = Files.lines(file.toPath()).filter(s -> s.toLowerCase().contains("song")).count();
            System.out.println(count);
        }catch(IOException e){
            System.out.println("There was an error reading the file");
        }


    }

}
