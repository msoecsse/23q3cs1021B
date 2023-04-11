package week4.examreview;

public class Dog extends Mammal implements Trainable{

    private int dogTag;

    public Dog(String hairColor, int dogTag){
        super(hairColor);
        this.dogTag = dogTag;
    }

    @Override
    public boolean train() {
        return true;
    }
}
