package week6.exceptions;

public class StackOverflowExample {

    public String getString(){

        String output = this.getString();

        return output;
    }

    public static void main(String[] args) {
        StackOverflowExample e = new StackOverflowExample();
        e.getString();

    }
}
