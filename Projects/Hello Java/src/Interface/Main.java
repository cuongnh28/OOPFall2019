package Interface;

public class Main {
    public static void main(String[] args) {
        Machine machine=new Machine();
        Manager manager=new Manager("Cuong");
        machine.call();
        machine.showInfo();
        manager.showInfo();
        System.out.println("-----------------");
        detailInfo(machine);
        detailInfo(manager);
        machine.study();
    }
    public static void detailInfo(Info info){
        info.showInfo();
    }
}
