package week2;

public class EmployeeDriver {

    public static void main(String[] args) {

        Employee bob = new Employee("Bob", 27);
        Person nash = new Person("Nash");

        bob.display();

        nash.display();

        Person bobAtHome = bob;
        bobAtHome.display();



    }

}
