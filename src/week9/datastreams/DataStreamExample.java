package week9.datastreams;

import javax.xml.crypto.Data;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class DataStreamExample {

    public static void main(String[] args) {

        File file = new File("src/week9/datastreams/out.bmsoe");

        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(file))){


            out.writeInt(123456);

//            out.writeChar('B');
//            out.writeChar('M');
//            out.writeChar('S');
//            out.writeChar('O');
//            out.writeChar('E');
//            out.writeInt(300);
//
//            for(int i = 0; i<300; i++){
//                out.writeDouble(Math.random());
//            }


        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
}
