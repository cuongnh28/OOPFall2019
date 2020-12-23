package ReQLTV;

public class TapChi extends TaiLieu {
    private int soph,thangph;

    public TapChi() {
    }

    public TapChi(String ma, String tennxb, int soph, int thangph, int sobanph) {
        super(ma, tennxb, sobanph);
        this.soph = soph;
        this.thangph = thangph;
    }

    public int getSoph() {
        return soph;
    }

    public void setSoph(int soph) {
        this.soph = soph;
    }

    public int getThangph() {
        return thangph;
    }

    public void setThangph(int thangph) {
        this.thangph = thangph;
    }

    @Override
    public String toString() {
        return super.getMa() + "\t" + super.getTennxb() + "\t"
                + soph + "\t" + thangph + "\t" + super.getSobanph();
    }
}
