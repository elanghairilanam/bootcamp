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

        if (posisi.equalsIgnoreCase("Koordinator")){
            if ((jenisKelamin.equalsIgnoreCase("Pria") && (umur >= 21 && umur <= 30) && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3"))) || (jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5)){
                System.out.println(nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nSelamat, "+ nama + ".\nAnda memenuhi syarat sebagai Koordinator. Dan akan masuk ke Tahap Selanjutnya.");

            }else {
                System.out.println(nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nMaaf, "+ nama + ".\nAnda Tidak memenuhi syarat sebagai Koordinator. Dan Tidak akan masuk ke Tahap Selanjutnya.");
            }
        }

        if (posisi.equalsIgnoreCase("Admin")){
            if ((jenisKelamin.equalsIgnoreCase("Wanita") && (umur >= 20 && umur <= 25) && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8 || pengalaman >= 1)) || (jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8 && pengalaman >= 3) || (jenisKelamin.equalsIgnoreCase("Pria") && (umur >= 20 && umur <= 30) && penampilan >= 8 && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2)){
                System.out.println(nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nSelamat, "+ nama + ".\nAnda memenuhi syarat sebagai Admin. Dan akan masuk ke Tahap Selanjutnya.");

            }else{
                System.out.println(nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nMaaf, "+ nama + ".\nAnda Tidak memenuhi syarat sebagai Admin. Dan Tidak akan masuk ke Tahap Selanjutnya.");

            }
        }

        if(posisi.equalsIgnoreCase("SPV")){
            if (((umur >= 23 && umur <= 30) && lulusan.equalsIgnoreCase("S1") && pengalaman > 1) || ((umur >= 25 && umur <= 35) && lulusan.equalsIgnoreCase("D3") && pengalaman > 4)){
                System.out.println(nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nSelamat, "+ nama + ".\nAnda memenuhi syarat sebagai SPV. Dan akan masuk ke Tahap Selanjutnya.");

            }else {
                System.out.println(nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut\nBerikut Hasil dari Rekrutmen:\nMaaf, "+ nama + ".\nAnda Tidak memenuhi syarat sebagai SPV. Dan Tidak akan masuk ke Tahap Selanjutnya.");
            }
        }
    }
}