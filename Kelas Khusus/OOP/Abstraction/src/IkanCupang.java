import Child.HewanAir;

public class IkanCupang extends HewanAir {

    private String warnaSisik;

    public IkanCupang(String nama, int usia, boolean hidupDiLaut, String warnaSisik) {
        super(nama, usia, hidupDiLaut);
        this.warnaSisik = warnaSisik;
    }

    public String getWarnaSisik() {
        return warnaSisik;
    }

    public void setWarnaSisik(String warnaSisik) {
        this.warnaSisik = warnaSisik;
    }

    @Override
    public void gerak() {
        System.out.print("Aku berenang untuk bergerak");
        super.gerak();
    }

    @Override
    public void suara() {
        System.out.println("Suaraku ...");
    }
}
