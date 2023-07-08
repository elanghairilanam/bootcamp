public class TunjanganUmum {
    public static void main(String[] args) {
        System.out.println(kalkulasiTunjanganUmumJabatan(1));
        System.out.println(kalkulasiTunjanganUmumJabatan(2));
        System.out.println(kalkulasiTunjanganUmumJabatan(3));
        System.out.println(kalkulasiTunjanganUmumJabatan(4));
    }

    public static int kalkulasiTunjanganUmumJabatan(int golonganPangkat){
        int tunjanganJabatan = 0;

        switch (golonganPangkat){
            case 1:
                return tunjanganJabatan = 175000;

            case 2:
                return tunjanganJabatan = 180000;

            case 3:
                return tunjanganJabatan = 185000;

            case 4:
                return tunjanganJabatan = 190000;

            default:
                return tunjanganJabatan;
        }
    }
}
