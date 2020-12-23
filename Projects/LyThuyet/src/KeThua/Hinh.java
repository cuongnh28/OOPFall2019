package KeThua;

/**
 *
 * @author The Godfather
 */
public class Hinh {
    public class Diem {

        private int x, y;

        public Diem(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public class TuGiac {

        protected Diem d1, d2, d3, d4;

        public void setD1(Diem d1) {
            this.d1 = d1;
        }

        public Diem getD1() {
            return d1;
        }

        public void setD2(Diem d2) {
            this.d2 = d2;
        }

        public void setD3(Diem d3) {
            this.d3 = d3;
        }

        public void setD4(Diem d4) {
            this.d4 = d4;
        }

        public Diem getD2() {
            return d2;
        }

        public Diem getD3() {
            return d3;
        }

        public Diem getD4() {
            return d4;
        }

        public String toString() {
            return d1.getX() + "\t" + d1.getY() + "\t" + d2.getX() + "\t" + d2.getY()
                    + "\t" + d3.getX() + "\t" + d3.getY() + "\t" + d4.getX() + "\t"
                    + d4.getY();
        }
    }

    public class HinhVuong extends TuGiac {

        public HinhVuong() {
            d1 = new Diem(0, 0);
            d2 = new Diem(0, 1);
            d3 = new Diem(1, 0);
            d4 = new Diem(1, 1);
        }
    }
}
