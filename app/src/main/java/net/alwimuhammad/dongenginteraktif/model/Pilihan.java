package net.alwimuhammad.dongenginteraktif.model;

/**
 *
 */
public class Pilihan {
    private String mTeks;
    private int mPilihanSelanjutnya;

    public Pilihan(String teks, int pilihanSelanjutnya) {
        mTeks = teks;
        mPilihanSelanjutnya = pilihanSelanjutnya;
    }

    public String getTeks() {
        return mTeks;
    }

    public void setTeks(String teks) {
        mTeks = teks;
    }

    public int getPilihanSelanjutnya() {
        return mPilihanSelanjutnya;
    }

    public void setPilihanSelanjutnya(int pilihanSelanjutnya) {
        mPilihanSelanjutnya = pilihanSelanjutnya;
    }


}
