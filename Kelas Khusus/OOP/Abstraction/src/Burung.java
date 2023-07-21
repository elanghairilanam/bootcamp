import Child.HewanDarat;

public class Burung extends HewanDarat {

    private String warnaBulu;

    public Burung(String nama, int usia, int jumlahKaki, String warnaBulu) {
        super(nama, usia, jumlahKaki);
        this.warnaBulu = warnaBulu;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void gerak() {
        System.out.println("Aku terbang untuk bergerak");
    }

    @Override
    public void suara() {
        System.out.println("Suaraku Chirp!!");
    }
}
