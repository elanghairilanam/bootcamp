import java.util.Scanner;

public class appMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] number = input.split(" ");
        int jumlahOrang = Integer.parseInt(number[0]);
        int jumlahBulan = Integer.parseInt(number[1]);

        int[] hari = hitungHariDalamBulan(jumlahBulan);

        int jumlahTabungan = getTabunganPerBulan(jumlahBulan,hari);

        int totalTabungan = jumlahTabungan*jumlahOrang;

        System.out.println(totalTabungan);

    }

    public static int[] hitungHariDalamBulan(int bulan) {
        int[] hari = new int[bulan];

        int index = 0;

        for (int i = 1; i <= hari.length; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    hari[index] = 31;
                    index++;
                    break;
                case 2:
                    hari[index] = 29;
                    index++;
                    break;
                default:
                    hari[index] = 30;
                    index++;
                    break;
            }
        }

        return hari;
    }

    public static int getTabunganPerBulan(int jumlahBulan, int[] hariPerBulan){
        int tabunganPerHari = 0;
        int totalTabungan = 0;

        for (int bulanKe = 0; bulanKe < jumlahBulan; bulanKe++) {
            for (int hariKe = 1; hariKe <= hariPerBulan[bulanKe]; hariKe++) {
                tabunganPerHari = hariKe * 1000;
                totalTabungan += tabunganPerHari;
            }
        }

        return totalTabungan;
    }
}
