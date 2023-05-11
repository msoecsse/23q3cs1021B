package week9.bufferexample;

import java.io.*;

public class DataStreamExample {

    public static void main(String[] args) {
//
      File file = new File("src/week9/bufferexample/lotsOfNumbers.bin");
//
//        try(DataOutputStream stream = new DataOutputStream(new FileOutputStream(file))){
//
//            long startTime = System.currentTimeMillis();
//
//            for(int i = 1; i<10_000_000; i++){
//                stream.writeDouble(Math.random());
//            }
//
//            long endTime = System.currentTimeMillis();
//            System.out.println("Not Buffered execution time: " + (endTime-startTime) + "ms");
//
//        }catch(IOException e){
//            System.out.println("There was an error reading the file");
//        }

        try(DataOutputStream stream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file),1))){

            long startTime = System.currentTimeMillis();

            for(int i = 1; i<10_000_000; i++){
                stream.writeDouble(Math.random());
            }

            long endTime = System.currentTimeMillis();
            System.out.println("Buffered execution time: " + (endTime-startTime) + "ms");

        }catch(IOException e){
            System.out.println("There was an error reading the file");
        }

    }
}
