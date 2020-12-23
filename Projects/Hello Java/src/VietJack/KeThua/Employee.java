
package VietJack.KeThua;

public class Employee {
    private String name;
    private int age;
    Address address;
    
    public void display(){
        System.out.print("Name: "+name+"\tAge: "+age);
        address.display();
    }

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
}
