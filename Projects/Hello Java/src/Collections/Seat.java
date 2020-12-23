package Collections;

public class Seat {
    private String seatNumber;
    boolean reserved;
    
    public Seat(String seatNumber) {
        this.seatNumber=seatNumber;
        this.reserved=false;
    }

    public boolean reserve() {
        if(!reserved) {
            this.reserved=true;
            System.out.println("Ghe "+this.seatNumber+" da duoc dat.");
            return true;
        }
        return false;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
    
}
