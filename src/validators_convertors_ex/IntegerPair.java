package validators_convertors_ex;

/**
 * Created by Nikita on 02.04.2015.
 */
public class IntegerPair {
    private int fst;
    private int scd;

    public IntegerPair() {
    }

    public IntegerPair(int fst, int scd) {
        this.fst = fst;
        this.scd = scd;
    }

    public int getFst() {
        return fst;
    }

    public void setFst(int fst) {
        this.fst = fst;
    }

    public int getScd() {
        return scd;
    }

    public void setScd(int scd) {
        this.scd = scd;
    }

   //Если есть кониертер, не нужно реализовывать toString
   /* @Override //
    public String toString() {
        return fst + "." + scd;
    }*/
}
