import java.util.Random;
import java.util.Scanner;

public class PigDice {

    public static void main(String[] args) {
        String nama, jenisKelamin, lulusan, posisi;
        int umur, pengalaman, penampilan;

        Scanner input = new Scanner(System.in);

        System.out.println("Nama:");
        nama = input.next();

        System.out.println("Umur:");
        umur = input.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita):");
        jenisKelamin = input.next();

        System.out.println("Lulusan:");
        lulusan = input.next();

        System.out.println("Pengalaman (Tahun):");
        pengalaman = input.nextInt();

        System.out.println("Penampilan (1/10):");
        penampilan = input.nextInt();

        System.out.println("Posisi yang dilamar (SPV,Admin,Koordinator):");
        posisi = input.next();

        if (posisi.equalsIgnoreCase("SPV")){
            String spv = isSpv(nama,umur,lulusan,pengalaman);
            System.out.println(spv);
        }

        if (posisi.equalsIgnoreCase("Admin")){
            String admin = isAdmin(nama,jenisKelamin,umur,lulusan,pengalaman,penampilan);
            System.out.println(admin);
        }

        if (posisi.equalsIgnoreCase("Koordinator")){
            String koordinator = isKoordinator(nama,jenisKelamin,umur,lulusan,pengalaman);
            System.out.println(koordinator);
        }
    }

    public static String isKoordinator(String nama, String jenisKelamin, int umur, String lulusan, int pengalaman){
        String message = "";

        if (jenisKelamin.equalsIgnoreCase("Pria") && (umur >= 21 && umur <= 30) && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3"))){
            message += nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nSelamat, "+ nama + ".\nAnda memenuhi syarat sebagai Koordinator. Dan akan masuk ke Tahap Selanjutnya.";

        } else if (jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5) {
            message += nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nSelamat, "+ nama + ".\nAnda memenuhi syarat sebagai Koordinator. Dan akan masuk ke Tahap Selanjutnya.";

        }else {
            message += nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nMaaf, "+ nama + ".\nAnda Tidak memenuhi syarat sebagai Koordinator. Dan Tidak akan masuk ke Tahap Selanjutnya.";
        }

        return message;
    }

    public static String isAdmin(String nama, String jenisKelamin, int umur, String lulusan, int pengalaman, int penampilan){
        String message = "";

        if (jenisKelamin.equalsIgnoreCase("Wanita") && (umur >= 20 && umur <= 25) && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8 || pengalaman >= 1)){
            message += nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nSelamat, "+ nama + ".\nAnda memenuhi syarat sebagai Admin. Dan akan masuk ke Tahap Selanjutnya.";

        } else if (jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8 && pengalaman >= 3) {
            message += nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nSelamat, "+ nama + ".\nAnda memenuhi syarat sebagai Admin. Dan akan masuk ke Tahap Selanjutnya.";

        } else if (jenisKelamin.equalsIgnoreCase("Pria") && (umur >= 20 && umur <= 30) && penampilan >= 8 && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2) {
            message += nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nSelamat, "+ nama + ".\nAnda memenuhi syarat sebagai Admin. Dan akan masuk ke Tahap Selanjutnya.";

        } else{
            message += nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nMaaf, "+ nama + ".\nAnda Tidak memenuhi syarat sebagai Admin. Dan Tidak akan masuk ke Tahap Selanjutnya.";
        }

        return message;
    }

    public static String isSpv(String nama, int umur, String lulusan, int pengalaman){

        String message = "";

        if ((umur >= 23 && umur <= 30) && lulusan.equalsIgnoreCase("S1") && pengalaman > 1){
            message += nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nSelamat, "+ nama + ".\nAnda memenuhi syarat sebagai SPV. Dan akan masuk ke Tahap Selanjutnya.";

        } else if ((umur >= 25 && umur <= 35) && lulusan.equalsIgnoreCase("D3") && pengalaman > 4) {
            message += nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nSelamat, "+ nama + ".\nAnda memenuhi syarat sebagai SPV. Dan akan masuk ke Tahap Selanjutnya.";

        }else {
            message += nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nMaaf, "+ nama + ".\nAnda Tidak memenuhi syarat sebagai SPV. Dan Tidak akan masuk ke Tahap Selanjutnya.";
        }

        return message;
    }
}