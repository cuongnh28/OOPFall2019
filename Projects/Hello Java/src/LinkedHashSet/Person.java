package LinkedHashSet;

import javax.print.attribute.HashAttributeSet;

public class Person {
    private int id;

    public Person(int id) {
        super();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
//    public boolean equals(Object obj) {
//        return (obj instanceof Person) ? (((Person) obj).getId() == this.id) : false;
//                }
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person another = (Person) obj;
            if (this.id==another.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
