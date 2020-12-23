package Collections;

public class Main {
    public static void main(String[] args) {
//        char a='A'+1;
//        System.out.println(a);
//        System.out.println('A'+String.format("02d", 12));
        Cinema cinema=new Cinema("CGV",8,12);
        cinema.printCinemaSeats();
        if(cinema.reserveSeat("A03")) {
            System.out.println("Tra tien cho viec dat ghe.");
        } else{
            System.out.println("Ghe nay da duoc dat.");
        }
        System.out.println("-------------------------");
        if(cinema.reserveSeat("A03")) {
            System.out.println("Tra tien cho viec dat ghe.");
        } else{
            System.out.println("Ghe nay da duoc dat.");
        }
    }
}
