import java.util.Scanner;

public class GajiPNSElang {
    /**
     * Created By : Elang Hairilanam
     * Created At : 20:21 Jumat, 14 Juli 2023
     */

    public static void main(String[] args) {

        String nama, tipeGolongan, statusPernikahanString;

        int golonganPangkat, masaKerja, jumlahAnak,gajiPokok, tunjanganKeluarga, tunjanganAnak, tunjanganBeras, tunjanganUmumJabatan,
        gajiKotor, potonganPPH, potonganIWP, potonganTaperum, gajiBersih,statusPernikahan;

        Scanner scanner = new Scanner(System.in);

        // Input User
        System.out.println("Nama :");
        nama = scanner.nextLine();

        System.out.println("Golongan Pangkat :");
        golonganPangkat = Integer.valueOf(scanner.nextLine());

        System.out.println("Tipe Golongan : ");
        tipeGolongan = scanner.nextLine();

        System.out.println("Masa Kerja : ");
        masaKerja = Integer.valueOf(scanner.nextLine());

        System.out.println("Status Pernikahan : (kawin/cerai/belum kawin)");
        statusPernikahanString = scanner.nextLine();

        System.out.println("Jumlah Anak : ");
        jumlahAnak = Integer.valueOf(scanner.nextLine());

        // konversi status pernikahan ke angka
        statusPernikahan = convertStatusPernikahanToInt(statusPernikahanString);

        gajiPokok = kalkulasiGajiPokok(masaKerja,tipeGolongan,golonganPangkat);

        tunjanganKeluarga = kalkulasiTunjanganKeluarga(statusPernikahan, gajiPokok);

        tunjanganAnak = kalkulasiTunjanganAnak(jumlahAnak, gajiPokok);

        tunjanganBeras = kalkulasiTunjanganBeras(statusPernikahan, jumlahAnak);

        tunjanganUmumJabatan = kalkulasiTunjanganUmumJabatan(golonganPangkat);

        gajiKotor = kalkulasiGajiKotor(gajiPokok,tunjanganAnak,tunjanganKeluarga, tunjanganUmumJabatan, tunjanganBeras);

        potonganPPH = kalkulasiPotonganPPH(gajiPokok,statusPernikahan,gajiKotor,jumlahAnak,tunjanganKeluarga,tunjanganAnak);

        potonganIWP = kalkulasiPotonganIWP(gajiPokok,tunjanganAnak,tunjanganKeluarga);

        potonganTaperum = kalkulasiPotonganTaperum(golonganPangkat);

        gajiBersih = kalkulasiGajiBersih(gajiKotor,potonganPPH,potonganIWP,potonganTaperum);
        
        displayOutput(nama,gajiPokok,tunjanganKeluarga,tunjanganAnak,tunjanganBeras,tunjanganUmumJabatan,
                gajiKotor,potonganPPH,potonganIWP,potonganTaperum,gajiBersih);
    }

    public static int convertStatusPernikahanToInt(String status){
        int statusInt;
        switch (status.toLowerCase()){
            case "kawin":
                statusInt = 1;
                break;
            default:
                statusInt = 0;
                break;
        }

        return statusInt;
    }

    public static int kalkulasiGajiPokok(int masaKerja, String tipeGolongan,int golonganPangkat){
        // variable untuk menampung nilai return
        int[][] data;

        // untuk mendapatkan jumlah maksimal row saat pengamnilan data
        int maxMasaKerja = getMaxMasaKerja(golonganPangkat);

        // untuk mendapatkan berapa kali kolom di loop
        int banyakTipeGolongan = getBanyakTipeGolongan(golonganPangkat);

        // untuk mendapatkan nilai int yang digunakan sebagai target kolom
        int tipeGolonganInt = koversiTipeGolonganToInt(tipeGolongan);

        if (masaKerja > maxMasaKerja ){
            masaKerja = maxMasaKerja;
        }

        // untuk mengambil data arr sesuai dengan golongan pangkat
        data = getDataArrGolongan(golonganPangkat);

        // mengambil data dari data array sesuai dengan golongan pangkat, masa kerja, dan tipe golongan
        int result = data[masaKerja][tipeGolonganInt];

        return result;
    }

    public static int[][] getDataArrGolongan(int golonganPangkat){
        int data[][][] = {arrGolongan1(),arrGolongan2(),arrGolongan3(),arrGolongan4()};

        return data[golonganPangkat-1];
    }

    public static int[][] arrGolongan1(){
        int[][] data = {
                {1560800,1560800,1560800,1560800},
                {1560800,1560800,1560800,1560800},
                {1610000,1610000,1610000,1610000},
                {1610000,1704500,1776600,1851800},
                {1660700,1704500,1776600,1851800},
                {1660700,1758200,1832600,1910100},
                {1713000,1758200,1832600,1910100},
                {1713000,1813600,1890300,1970200},
                {1766900,1813600,1890300,1970200},
                {1766900,1870700,1949800,2032300},
                {1822600,1870700,1949800,2032300},
                {1822600,1929600,2011200,2096300},
                {1880000,1929600,2011200,2096300},
                {1880000,1990400,2074600,2162300},
                {1939200,1990400,2074600,2162300},
                {1939200,2053100,2139900,2230400},
                {2000300,2053100,2139900,2230400},
                {2000300,2117700,2207300,2300700},
                {2063300,2117700,2207300,2300700},
                {2063300,2184400,2276800,2373100},
                {2128300,2184400,2276800,2373100},
                {2128300,2253200,2348500,2447900},
                {2195300,2253200,2348500,2447900},
                {2195300,2324200,2422500,2525000},
                {2264400,2324200,2422500,2525000},
                {2264400,2397400,2498800,2604500},
                {2335800,2397400,2498800,2604500},
                {2335800,2472900,2557500,2686500}
        };

        return data;
    }

    public static int[][] arrGolongan2(){
        int[][] data = {
                {2022200,2022200,2022200,2022200},
                {2054100,2054100,2054100,2054100},
                {2054100,2054100,2054100,2054100},
                {2118800,2208400,2301800,2399200},
                {2118800,2208400,2301800,2399200},
                {2185500,2277900,2374300,2474700},
                {2185500,2277900,2374300,2474700},
                {2254300,2349700,2449100,2552700},
                {2254300,2349700,2449100,2552700},
                {2325300,2423700,2526200,2633100},
                {2325300,2423700,2526200,2633100},
                {2398600,2500000,2605800,2716000},
                {2398600,2500000,2605800,2716000},
                {2474100,2578800,2687800,2801500},
                {2474100,2578800,2687800,2801500},
                {2552000,2660000,2772500,2889800},
                {2552000,2660000,2772500,2889800},
                {2632400,2743800,2859800,2980800},
                {2632400,2743800,2859800,2980800},
                {2715300,2830200,2949900,3074700},
                {2715300,2830200,2949900,3074700},
                {2800800,2919300,3042800,3171500},
                {2800800,2919300,3042800,3171500},
                {2889100,3011200,3138600,3271400},
                {2889100,3011200,3138600,3271400},
                {2980000,3106100,3237500,3374400},
                {2980000,3106100,3237500,3374400},
                {3073900,3203900,3339400,3480700},
                {3073900,3203900,3339400,3480700},
                {3170700,3304800,3444600,3590300},
                {3170700,3304800,3444600,3590300},
                {3270600,3408900,3553100,3703400},
                {3270600,3408900,3553100,3703400},
                {3373600,3516300,3665000,3820000}
        };

        return data;
    }

    public static int[][] arrGolongan3(){
        int[][] data = {
                {2579400,2688500,2802300,2920800},
                {2579400,2688500,2802300,2920800},
                {2660700,2773200,2890500,3012800},
                {2660700,2773200,2890500,3012800},
                {2744500,2860500,2981500,3107700},
                {2744500,2860500,2981500,3107700},
                {2830900,2950600,3075500,3205500},
                {2830900,2950600,3075500,3205500},
                {2920100,3043600,3172300,3306500},
                {2920100,3043600,3172300,3306500},
                {3012000,3139400,3272200,3410600},
                {3012000,3139400,3272200,3410600},
                {3106900,3238300,3375300,3518100},
                {3106900,3238300,3375300,3518100},
                {3204700,3340300,3481600,3628900},
                {3204700,3340300,3481600,3628900},
                {3305700,3445500,3591200,3743100},
                {3305700,3445500,3591200,3743100},
                {3409800,3554000,3704300,3861000},
                {3409800,3554000,3704300,3861000},
                {3517200,3665900,3821000,3982600},
                {3517200,3665900,3821000,3982600},
                {3627900,3781400,3941400,4108100},
                {3627900,3781400,3941400,4108100},
                {3742200,3900500,4065500,4237500},
                {3742200,3900500,4065500,4237500},
                {3860100,4023300,4193500,4370900},
                {3860100,4023300,4193500,4370900},
                {3981600,4150100,4325600,4508600},
                {3981600,4150100,4325600,4508600},
                {4107000,4280800,4461800,4650600},
                {4107000,4280800,4461800,4650600},
                {4236400,4415600,4602400,4797000}
        };

        return data;
    }

    public static int[][] arrGolongan4(){
        int[][] data = {
                {3044300,3173100,3307300,3447200,3593100},
                {3044300,3173100,3307300,3447200,3593100},
                {3140200,3272100,3411500,3555800,3706200},
                {3140200,3272100,3411500,3555800,3706200},
                {3239100,3376100,3518900,3667800,3822900},
                {3239100,3376100,3518900,3667800,3822900},
                {3341100,3482500,3629800,3783300,3943300},
                {3341100,3482500,3629800,3783300,3943300},
                {3446400,3592100,3744100,3902500,4067500},
                {3446400,3592100,3744100,3902500,4067500},
                {3554900,3705300,3862000,4025400,4195700},
                {3554900,3705300,3862000,4025400,4195700},
                {3666900,3822000,3983600,4152200,4327800},
                {3666900,3822000,3983600,4152200,4327800},
                {3782400,3942400,4109100,4282900,4462100},
                {3782400,3942400,4109100,4282900,4462100},
                {3901500,4066500,4238500,4417800,4604700},
                {3901500,4066500,4238500,4417800,4604700},
                {4024400,4194600,4372000,4557000,4749700},
                {4024400,4194600,4372000,4557000,4749700},
                {4151100,4326700,4509700,4700500,4899300},
                {4151100,4326700,4509700,4700500,4899300},
                {4281800,4463000,4651800,4848500,5053600},
                {4281800,4463000,4651800,4848500,5053600},
                {4416700,4603500,4798300,5001200,5212800},
                {4416700,4603500,4798300,5001200,5212800},
                {4555800,4748500,4949400,5158700,5377000},
                {4555800,4748500,4949400,5158700,5377000},
                {4699300,4898100,5105300,5321200,5546300},
                {4699300,4898100,5105300,5321200,5546300},
                {4847300,5052300,5266100,5488800,5721000},
                {4847300,5052300,5266100,5488800,5721000},
                {5000000,5211500,5431900,5661700,5901200}
        };

        return data;
    }


    public static int getMaxMasaKerja(int golonganPangkat){
        int max;

        int[] golonganMaxMasaKerja = {27,33,32,32};

        return max = golonganMaxMasaKerja[golonganPangkat-1];
    }

    public static int koversiTipeGolonganToInt(String tipeGolongan){
        switch (tipeGolongan.toLowerCase()){
            case "b":
                return 1;
            case "c":
                return 2;
            case "d":
                return 3;
            case "e":
                return 4;
            default:
                return 0;
        }
    }

    public static int getBanyakTipeGolongan(int golonganPangkat){
        int[] banyakTipeGolongan = {4,4,4,5};

        return banyakTipeGolongan[golonganPangkat-1];
    }

    public static int kalkulasiTunjanganKeluarga(int statusPernikahan,int gajiPokok){
        // variable menampung return value
        int tunjanganKeluarga;

        // menikah 10% dari gaji pokok
        switch (statusPernikahan){
            case 1:
                tunjanganKeluarga = (int)(0.1 * gajiPokok);
                break;
            default:
                tunjanganKeluarga = 0;
                break;
        }

        return tunjanganKeluarga;
    }

    public static int kalkulasiTunjanganAnak(int jumlahAnak,int gajiPokok){
        // variable penampung return value
        int tunjanganAnak = 0;

        // jumlah maksimal anak
        int maxAnak = 2;

        // jika lebih maka gunakan jumlah maksimal anak
        if (jumlahAnak > maxAnak){
            jumlahAnak = maxAnak;
        }

        // operasi untuk menghitung tunjangan per anak = 2% dari gaji pokok
        for (int i = 0; i < jumlahAnak; i++) {
            int tunjanganPerAnak = (int)(0.02 * gajiPokok);
            tunjanganAnak += tunjanganPerAnak;
        }

        return tunjanganAnak;
    }

    public static int kalkulasiTunjanganBeras(int statusPernikahan, int jumlahAnak){
        // return value
        int tunjanganBerasTotal = 0;

        int tunjanganBerasPerOrang = 0;

        int hargaBeras = 15000;

        int jumlahBeras = 10;

        int jumlahPasutri = 1;

        int jumlahKeluarga = 0;

        int maxAnak = 2;

        if(jumlahAnak > maxAnak){
            jumlahAnak = maxAnak;
        }

        // jika menikah maka jumlah pasutri 2
        switch (statusPernikahan){
            case 1:
                jumlahPasutri += 1;
                break;
            default:
                jumlahPasutri +=0;
                break;
        }

        // menghitung jumlah keluarga
        jumlahKeluarga = jumlahAnak + jumlahPasutri;

        // menghitung jumlah beras untuk seluruh keluarga
        tunjanganBerasPerOrang = jumlahBeras * jumlahKeluarga;

        // menghitung harga beras total
        tunjanganBerasTotal = tunjanganBerasPerOrang * hargaBeras;

        return tunjanganBerasTotal;
    }

    public static int kalkulasiTunjanganUmumJabatan(int golonganPangkat){
        int[] tunjanganUmumJabatan = {175000,180000,185000,190000};

        return tunjanganUmumJabatan[golonganPangkat-1];
    }

    public static int kalkulasiGajiKotor(int gajiPokok,int tunjanganAnak,int tunjanganKeluarga,int tunjanganUmumJabatan, int tunjanganBeras){
        int gajiKotor;

        return gajiKotor = gajiPokok + tunjanganAnak + tunjanganBeras + tunjanganKeluarga + tunjanganUmumJabatan;

    }

    public static int kalkulasiPotonganPPH(int gajiPokok,int statusPernikahan,int gajiKotor,int jumlahAnak,int tunjanganKeluarga,int tunjanganAnak){
        int totalPajakPPH = 0;

        int pajakDiriSendiri = 36000000;

        int pajakPerAnak = 3000000;

        int pajakPasutri = 0;

        int totalPajakAnak = 0;

        int maxAnak = 3;

        double penghasilanKenaPajak, pajakJabatan,biayaJabatan,iuranPensiun;

        int penguranganNeto,neto,netoSatuTahun,pengahasilanKenaPajakDibulatkan,pphSetahun,pphSebulan;


        if (jumlahAnak > 3){
            jumlahAnak = maxAnak;
        }

        // dikenakan pajak jika sudah menikah
        if (statusPernikahan == 1){
            pajakPasutri = 3000000;
        }

        pajakJabatan = 0.05;

        biayaJabatan = pajakJabatan * gajiKotor;

        iuranPensiun = getIuranPensiun(gajiPokok,tunjanganKeluarga,tunjanganAnak);

        penguranganNeto = getPenguranganNeto((int) biayaJabatan,(int) iuranPensiun);

        neto = gajiKotor - penguranganNeto;

        netoSatuTahun = neto * 12;

        boolean isPPH = getIsPPH(gajiKotor);

        if (isPPH){
            totalPajakAnak = pajakPerAnak * jumlahAnak;

            totalPajakPPH = pajakDiriSendiri + pajakPasutri + totalPajakAnak;

            penghasilanKenaPajak = netoSatuTahun - totalPajakPPH;

            pengahasilanKenaPajakDibulatkan = (int) Math.round(penghasilanKenaPajak);

            pphSetahun = getPPHSetahun(pengahasilanKenaPajakDibulatkan);

            pphSebulan = pphSetahun / 12;

            return pphSebulan;
        }
        else {
            return 0;
        }
    }

    public static int getPPHSetahun(int penghasilanKenaPajak){
        int pphSetahun = 0;
        int pajakSetahun = 5;

        pphSetahun = pajakSetahun * penghasilanKenaPajak / 100;

        return pphSetahun;
    }

    public static int getPenguranganNeto(double biayaJabatan, double iuranPensiun){
        int pengurangan = 0;

        pengurangan = (int)(biayaJabatan + iuranPensiun);

        return pengurangan;
    }

    public static boolean getIsPPH(int gajiKotor){
        if (gajiKotor > 4500000){
            return true;
        }else {
            return false;
        }
    }

    public static double getIuranPensiun(int gajiPokok, int tunjanganKeluarga, int tunjanganAnak){
        double iuranPensiun = 0.0475;
        double jumlahIuranTotal = 0;

        jumlahIuranTotal = iuranPensiun * (gajiPokok + tunjanganKeluarga + tunjanganAnak);

        return jumlahIuranTotal;
    }

    public static int kalkulasiPotonganIWP(int gajiPokok,int tunjanganAnak,int tunjanganKeluarga){
        int iwp = 0;

        int pajakIWP = 10;

        iwp = (gajiPokok + tunjanganAnak + tunjanganKeluarga) * pajakIWP/100;

        return iwp;
    }

    public static int kalkulasiPotonganTaperum(int golonganPangkat){
        int[] potonganTaperum = {3000,5000,7000,10000};

        return potonganTaperum[golonganPangkat-1];
    }

    public static int kalkulasiGajiBersih(int gajiKotor, int potonganPPH, int potonganIWP,int potonganTaperum){
        int gajiBersih = 0;

        gajiBersih = gajiKotor - potonganPPH - potonganIWP - potonganTaperum;

        return gajiBersih;
    }

    public static void displayOutput(String nama,int gajiPokok,int tunjanganKeluarga, int tunjanganAnak, int tunjanganBeras, int tunjanganUmumJabatan, int gajiKotor, int potonganPPH, int potonganIWP, int potonganTaperum, int gajiBersih){
        System.out.println("Simulasi Perhitungan Gaji Atas Nama "+nama);
        System.out.println("Gaji Pokok = RP." + gajiPokok);
        System.out.println("Tunjangan Keluarga = RP." + tunjanganKeluarga);
        System.out.println("Tunjangan Anak = RP." + tunjanganAnak);
        System.out.println("Tunjangan Beras = RP." + tunjanganBeras);
        System.out.println("Tunjangan Jabatan Umum = RP." + tunjanganUmumJabatan);
        System.out.println("Gaji Bruto = RP." + gajiKotor);
        System.out.println("Pph = RP." + potonganPPH);
        System.out.println("Potongan IWP = RP." + potonganIWP);
        System.out.println("Potongan Taperum = RP."+potonganTaperum);
        System.out.println("Gaji Take Home Pay = RP." + gajiBersih);
    }
}