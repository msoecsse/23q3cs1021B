package week2;

public class Employee extends Person {

    private final int ID;

    public Employee(String name, int ID){
        super(name);
        this.ID = ID;
    }

    public void display(){
        System.out.println(super.getName() + " has employee number " + this.ID);
    }

}
