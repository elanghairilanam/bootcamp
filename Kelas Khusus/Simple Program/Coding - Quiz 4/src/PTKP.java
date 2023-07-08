public class PTKP {
    public static void main(String[] args) {
        System.out.println(kalkulasiPTKP("Kawin", 1));
        System.out.println(kalkulasiPTKP("Belum Kawin", 0));
    }

    public static int kalkulasiPTKP(String statusPernikahan, int jumlahAnak){
        int jumlahPTKPAnakPerKeluarga = 0;
        int jumlahPasutri = 1;
        int ptkp = 0;

        if (statusPernikahan.equalsIgnoreCase("Kawin")){
            jumlahPasutri += 1;
        }

        if (jumlahPasutri == 2){
            ptkp += 36000000+3000000;
        }else {
            ptkp += 36000000;
        }

        for (int anakKe = 1; anakKe <= jumlahAnak; anakKe++) {
            if (anakKe <= 3){
                jumlahPTKPAnakPerKeluarga = anakKe*3000000;
            }
        }

        ptkp += jumlahPTKPAnakPerKeluarga;

        return ptkp;
    }
}
