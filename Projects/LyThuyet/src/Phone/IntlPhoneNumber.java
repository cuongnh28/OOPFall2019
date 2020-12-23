package Phone;

public class IntlPhoneNumber extends PhoneNumber {
    private int maqg;

    public IntlPhoneNumber() {
    }

    public IntlPhoneNumber(int maqg) {
        this.maqg = maqg;
    }

    public IntlPhoneNumber(int maqg, int mavung, int sdtnoivung) {
        super(mavung, sdtnoivung);
        this.maqg = maqg;
    }

    public int getMaqg() {
        return maqg;
    }

    public void setMaqg(int maqg) {
        this.maqg = maqg;
    }
    
    public String toString(){
        return maqg+"-"+super.getMavung()+"-"+super.getSdtnoivung();
    }
}
