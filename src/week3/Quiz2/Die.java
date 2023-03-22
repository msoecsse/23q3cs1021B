package week3.Quiz2;

public class Die implements ObjectOfChance {

    private int numberOfSides;
    private int value;

    Die(int numberOfSides){
        this.numberOfSides = numberOfSides;
        manipulate();
    }

    public int observe(){
        return value;
    }

    public void manipulate(){
        value = (int)(Math.random()*numberOfSides) + 1;
    }

}
