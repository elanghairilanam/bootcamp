public class TunjanganBeras {
    public static void main(String[] args) {
        System.out.println(kalkulasiTunjanganBeras("Kawin", 1));
        System.out.println(kalkulasiTunjanganBeras("Kawin", 10));
        System.out.println(kalkulasiTunjanganBeras("Belum Kawin", 0));

    }

    public static int kalkulasiTunjanganBeras(String statusPernikahan, int jumlahAnak){
        int hargaBeras = 15000;
        int jumlahBeras = 10;
        int maxJumlahAnak = 2;
        int jumlahKeluarga = 1;
        int tunjanganBeras = 0;

        if (statusPernikahan.equalsIgnoreCase("Kawin")){
            jumlahKeluarga += 1;
        }

        for (int anakKe = 1; anakKe <= jumlahAnak; anakKe++) {
            if (anakKe <= 2){
                jumlahKeluarga++;
            }
        }

        return tunjanganBeras = jumlahKeluarga*jumlahBeras*hargaBeras;
    }
}
