
package VietJack.KeThua;

public class Address {
    private String street;
    private int num;
    
    public void display(){
        System.out.println("\t\tStreet: "+street+"\tNumber: "+num);
    }

    public Address(String street, int num) {
        this.street = street;
        this.num = num;
    }
    
}
