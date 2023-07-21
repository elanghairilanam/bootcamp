package Parent;

public abstract class HewanPeliharaan {
    private String nama;

    private int usia;

    public HewanPeliharaan(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public abstract void suara();

    public abstract void gerak();
}
