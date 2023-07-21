package Child;

import Parent.HewanPeliharaan;

public abstract class HewanDarat extends HewanPeliharaan {

    private int jumlahKaki;

    public HewanDarat(String nama, int usia, int jumlahKaki) {
        super(nama, usia);
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    @Override
    public void suara() {
        System.out.println();
    }

    @Override
    public void gerak() {
        System.out.println();
    }
}
