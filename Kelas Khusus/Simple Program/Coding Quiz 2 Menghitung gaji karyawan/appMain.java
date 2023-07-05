import java.util.Scanner;

public class appMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputCabang = scanner.next();
        String inputJabatan = scanner.next();
        int masaKerja = scanner.nextInt();
        String isMenikah = scanner.next();

        int umk = getUMK (inputCabang);
        int gajiPokok = gajiPokokPegawai(masaKerja,inputJabatan,umk);
        int tunjanganKeluarga = hitungTunjanganKeluarga(isMenikah,gajiPokok);
        int tunjanganJabatan =  hitungTunjanganJabatan(masaKerja,gajiPokok);
        int tunjanganPegawai = hitungTunjanganPegawai(inputJabatan);
        int gajiKotor = gajiPokok+tunjanganJabatan+tunjanganPegawai+tunjanganKeluarga;
        int potonganPensiun = (int) (0.02*gajiKotor);
        int potonganBPJS = (int) (0.02*gajiKotor);
        int potonganPPH = (int) (0.05*gajiKotor);
        int gajiBersih = gajiKotor-potonganBPJS-potonganPPH-potonganPensiun;

        System.out.println(gajiPokok);
        System.out.println(tunjanganKeluarga);
        System.out.println(tunjanganJabatan);
        System.out.println(tunjanganPegawai);
        System.out.println(gajiKotor);
        System.out.println(potonganPensiun);
        System.out.println(potonganBPJS);
        System.out.println(potonganPPH);
        System.out.println(gajiBersih);
    }

    public static int getUMK(String cabang){
        switch (cabang.toLowerCase()){
            case "garut":
                return 1961085;

            case "bandung":
                return 3742276;

            case "jakarta":
                return 4453935;

            case "bekasi":
                return 4782935;

            case "bogor":
                return 4330249;

            case "palembang":
                return 3289409;

            default:
                return 0;
        }
    }

    public static int gajiPokokPegawai(int masaKerja, String jabatan,int umk){

        switch (jabatan.toLowerCase()){
            case "admin":
                return (masaKerja < 2) ? umk : (int) (umk*1.2);

            case "coordinator":
                return (masaKerja < 3) ? (int) (1.1*umk) : (int) (1.3*umk);

            case "spv":
                if (masaKerja < 2){
                    return (int) (umk * 1.25);
                } else if (masaKerja >= 2 && masaKerja <= 4) {
                    return (int) (umk*1.4);
                }else {
                    return (int) (umk*1.5);
                }

            case "sprinter":
                return (int) (umk*0.9);

            case "officer":
                return umk;

            case "manager":
                return (masaKerja < 3) ? (int) (1.5*umk) : 2*umk;

            default:
                return 0;
        }
    }

    public static int hitungTunjanganKeluarga(String menikah, int gajiPokok){
        switch (menikah.toLowerCase()){
            case "true":
                return (int) (0.1*gajiPokok);

            default:
                return 0;
        }
    }

    public static int hitungTunjanganJabatan(int masaKerja, int gajiPokok){
        if (masaKerja > 4){
            return (int) (0.05*gajiPokok);
        }else {
            return 0;
        }
    }

    public static int hitungTunjanganPegawai(String jabatan){
        switch (jabatan.toLowerCase()){
            case "admin":
                return 200000;
            case "coordinator":
                return 500000;
            case "spv":
                return 700000;
            case "manager":
                return 1000000;
            case "sprinter":
                return 200000;
            case "officer":
                return 200000;
            default:
                return 0;
        }
    }
}