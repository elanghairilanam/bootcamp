package Child;

import Parent.HewanPeliharaan;

public abstract class HewanAir extends HewanPeliharaan {

    private boolean hidupDiLaut;

    public HewanAir(String nama, int usia, boolean hidupDiLaut) {
        super(nama, usia);
        this.hidupDiLaut = hidupDiLaut;
    }

    public boolean isHidupDiLaut() {
        return hidupDiLaut;
    }

    public void setHidupDiLaut(boolean hidupDiLaut) {
        this.hidupDiLaut = hidupDiLaut;
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
