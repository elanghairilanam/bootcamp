import Child.HewanDarat;

public class Kucing extends HewanDarat {

    private String warnaRambut;

    public Kucing(String nama, int usia, int jumlahKaki, String warnaRambut) {
        super(nama, usia, jumlahKaki);
        this.warnaRambut = warnaRambut;
    }

    public String getWarnaRambut() {
        return warnaRambut;
    }

    public void setWarnaRambut(String warnaRambut) {
        this.warnaRambut = warnaRambut;
    }

    @Override
    public void gerak() {
        System.out.print("Aku berjalan untuk bergerak");
        super.gerak();
    }

    @Override
    public void suara() {
        System.out.println("Suaraku Meow!!");
    }
}
