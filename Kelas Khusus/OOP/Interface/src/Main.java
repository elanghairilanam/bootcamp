import ImplementsClass.Lingkaran;
import ImplementsClass.Persegi;
import ImplementsClass.SegiPanjang;
import Interface.OperasiBangunDatar;

public class Main {
    public static void main(String[] args) {
        SegiPanjang segiPanjang1 = new SegiPanjang(11,7);
        OperasiBangunDatar persegi1 = new Persegi(9);
        OperasiBangunDatar lingkaran1 = new Lingkaran(11);
        Lingkaran lingkaran2 = new Lingkaran(8);

        System.out.println(segiPanjang1.getKeliling());
        System.out.println(segiPanjang1.getLuas());
        System.out.println();
        System.out.println(persegi1.getKeliling());
        System.out.println(persegi1.getLuas());
        System.out.println();
        System.out.println(lingkaran1.getKeliling());
        System.out.println(lingkaran1.getLuas());
        System.out.println();
        System.out.println(lingkaran2.getKeliling());
        System.out.println(lingkaran2.getLuas());
    }
}
