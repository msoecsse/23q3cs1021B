package week8.streams;

import java.io.*;

public class OutputDataStreamDriver {

    public static void main(String[] args) {

        File file = new File("src/week8/streams/example.bin");

        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(file))){
//            out.write(68);
//            out.write(101);
            out.writeInt(4);

        }catch(IOException e){
            System.out.println("You done goofed");
        }



    }

}
