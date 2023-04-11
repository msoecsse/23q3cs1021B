package week2;

public class Person {

    protected final String name;

    public Person(String name){
        this.name = name;
    }

//    public Person(){
//        this.name = "John Doe";
//    }

    public String getName() {
        return name;
    }

    public void display(){
        System.out.println(this.getName());
    }
    
//    public abstract void boastAboutJob();

}
