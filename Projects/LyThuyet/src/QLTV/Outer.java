
package QLTV;

public class Outer {
    private String name;

    public Outer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     class Inner{
        private int num;
        public Inner(int num){
            this.num = num;
        }
        public int getNum(){
            return num;
        }
    }
    
}
