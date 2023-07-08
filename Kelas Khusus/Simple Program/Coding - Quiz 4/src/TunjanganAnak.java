public class TunjanganAnak {
    public static void main(String[] args) {
        System.out.println(kalkulasiTunjanganAnak(2,1000000));
        System.out.println(kalkulasiTunjanganAnak(1,1000000));
    }

    public static int kalkulasiTunjanganAnak(int jumlahAnak, int gajiPokok){
        int tunjanganPerAnak = 0;

        for (int anakKe = 1; anakKe <= jumlahAnak; anakKe++) {
            if (anakKe <= 2){
                tunjanganPerAnak += (int) (0.02 * gajiPokok);
            }
        }

        return tunjanganPerAnak;
    }
}
