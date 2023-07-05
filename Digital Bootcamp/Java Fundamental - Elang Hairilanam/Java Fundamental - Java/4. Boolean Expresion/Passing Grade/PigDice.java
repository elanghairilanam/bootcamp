import java.util.Random;
import java.util.Scanner;

public class PigDice {

    public static void main(String[] args) {
        int matematika, bhsInggris, bhsIndonesia, ipa;
        int passingGradeSmk = 73, passingGradeSastra =  75, passingGradeTik = 80;
        boolean isPassingSmk, isPassingSastra, isPassingTik;
        double avrgUjian, avrgBahasa;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nilai ujian Matematika:");
        matematika = input.nextInt();
        System.out.println("Masukan nilai ujian Bahasa Indonesia:");
        bhsIndonesia = input.nextInt();
        System.out.println("Masukan nilai ujian Bahasa Inggris:");
        bhsInggris = input.nextInt();
        System.out.println("Masukan nilai ujian IPA:");
        ipa = input.nextInt();

        avrgUjian = (matematika+bhsIndonesia+bhsInggris+ipa)/4;

        avrgBahasa = (bhsIndonesia+bhsInggris)/2;

        isPassingSmk = avrgUjian >= passingGradeSmk;
        isPassingSastra = avrgBahasa >= passingGradeSastra;
        isPassingTik = matematika > passingGradeTik;

        System.out.println("Hasil dari simulasi untuk persyaratan penerimaan calon siswa di SMK Padepokan 79 adalah sebagai berikut:");
        System.out.println("");
        System.out.println("Apakah anda memenuhi syarat untuk masuk ke SMK Padepokan 79: "+ isPassingSmk );
        System.out.println("Apakah anda memenuhi syarat untuk masuk ke Jurusan Sastra: "+ isPassingSastra);
        System.out.println("Apakah anda memenuhi syarat untuk masuk ke Jurusan Tik: "+ isPassingTik);
    }
}