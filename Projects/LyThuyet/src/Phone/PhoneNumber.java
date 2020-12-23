package Phone;

public class PhoneNumber {
    private int mavung,sdtnoivung;

    public PhoneNumber() {
    }

    public PhoneNumber(int mavung, int sdtnoivung) {
        this.mavung = mavung;
        this.sdtnoivung = sdtnoivung;
    }

    public int getMavung() {
        return mavung;
    }

    public void setMavung(int mavung) {
        this.mavung = mavung;
    }

    public int getSdtnoivung() {
        return sdtnoivung;
    }

    public void setSdtnoivung(int sdtnoivung) {
        this.sdtnoivung = sdtnoivung;
    }
    
    public String toString() {
        return "0" + mavung + "-" + sdtnoivung;
    }
    
}
