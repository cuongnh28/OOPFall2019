package SerializableObject;

public class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public static void main(String[] args) {
        Person p=new Person(1);
    }
}
