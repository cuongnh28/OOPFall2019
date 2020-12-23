
package VietJack.KeThua;

public class Main {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.setE();
        Address ad=new Address("Binh Minh",28);  
        Employee e=new Employee("Cuong",21,ad);
        e.display();
    }         
}
