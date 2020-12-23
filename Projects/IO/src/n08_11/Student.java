//luong output la de ghi vao
// input la viet ra.
//
package n08_11;
import java.io.Serializable;
public class Student implements Serializable{
    private String code,name;

    public Student() {
    }

    public Student(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Object[] toObject() {
        return new Object[] {code,name};
    }
}
