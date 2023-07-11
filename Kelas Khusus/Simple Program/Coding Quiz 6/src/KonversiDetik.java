import java.util.Scanner;

public class KonversiDetik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int detik = input % 60; // Sisa detik setelah menghitung jumlah menit
        int totalMenit = input / 60; // Jumlah menit setelah membagi total detik
        int menit = totalMenit % 60; // Sisa menit setelah menghitung jumlah jam
        int totalJam = totalMenit / 60; // Jumlah jam setelah membagi total menit
        int jam = totalJam % 24; // Sisa jam setelah menghitung jumlah hari
        int hari = totalJam / 24; // Jumlah hari setelah membagi total jam

        System.out.println("\n"+totalJam);
        System.out.println(totalMenit);

        System.out.println(hari);
        System.out.println(jam);
        System.out.println(menit);
        System.out.println(detik);
    }
}
