package week2;

public class Employee extends Person {

    private final int ID;

    public Employee(String name, int ID){
        super(name);
        this.ID = ID;
    }

//    public Employee(){
//        this("John Doe",(int)(Math.random()*10_000)+1);
//    }

    @Override
    public void display(){
//        super.display();
        System.out.println(super.name + " has employee number " + this.ID);
    }

}
