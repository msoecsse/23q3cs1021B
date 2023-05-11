package week9.datastreams;

import java.io.*;

public class DataStreamIn {

    public static void main(String[] args) {

        File file = new File("src/week9/datastreams/out.bmsoe");

        try(DataInputStream in = new DataInputStream(new FileInputStream(file))){

            System.out.print(in.readInt());


        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
}
