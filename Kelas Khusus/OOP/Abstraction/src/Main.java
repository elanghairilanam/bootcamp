import Child.HewanDarat;
import Parent.HewanPeliharaan;

public class Main {
    public static void main(String[] args) {
        Kucing peliharaan1 = new Kucing("Oyen",2,4,"Jingga");
        HewanDarat peliharaan2 = new Burung("Cawi",1,2,"Coklat");
        HewanPeliharaan peliharaan3 = new IkanCupang("Mista",1,false,"Navy");

        System.out.println("Aku " + peliharaan1.getNama() + ", rambutku berwarna " + peliharaan1.getWarnaRambut());
        peliharaan1.suara();
        peliharaan1.gerak();
        System.out.println();
        System.out.println("Aku " + peliharaan2.getNama() + ", rambutku berwarna " + ((Burung)peliharaan2).getWarnaBulu());
        peliharaan2.suara();
        peliharaan2.gerak();
        System.out.println();
        System.out.println("Aku " + peliharaan3.getNama() + ", sisikku berwarna " + ((IkanCupang)peliharaan3).getWarnaSisik());
        peliharaan3.suara();
        peliharaan3.gerak();
        System.out.println();
    }
}
