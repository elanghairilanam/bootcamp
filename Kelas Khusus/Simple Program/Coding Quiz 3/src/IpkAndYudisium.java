import java.util.Scanner;

public class IpkAndYudisium {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String[] arrNamaModule;
        String[] arrHarkat;
        int [] arrSks;
        int [] arrScore;
        int [] harkatToValue;

        String statusYudisium = "";
        int banyakModule = 0;
        double ipk, totalSks = 0, totalScore = 0;
        boolean isPending = false;

        //Input banyak module
        banyakModule = Integer.valueOf(input.nextLine());

        //inisialisasi semua Array yang dibutuhkan berdasarkan Banyak module
        arrNamaModule = new String[banyakModule];
        arrHarkat = new String[banyakModule];
        arrScore = new int [banyakModule];
        arrSks = new int [banyakModule];

        //Looping input data module berdasarkan banyak module
        for (int i = 0; i < banyakModule; i++) {
            arrNamaModule[i] = input.nextLine();
            arrSks[i] = Integer.parseInt(input.nextLine());
            arrHarkat[i] = input.nextLine();
        }

        arrScore = convertHarkat(arrHarkat);
        totalScore = calculateTotalScore(arrSks,arrScore);
        totalSks = calculateTotalSks(arrSks);
        ipk = calculateIpk(totalSks, totalScore);
        isPending = isPendingValidation(arrHarkat);
        statusYudisium = getYudisium(isPending, ipk);

        //print hasil
        printHasil(ipk, totalSks, statusYudisium, arrNamaModule, arrHarkat);
    }

    //menghitung total nilai pada sebuah array
    public static int calculateTotalSks(int[] sks) {
        int total = 0;
        for (int value : sks) {
            total += value;
        }
        return total;
    }

    public static int calculateTotalScore(int[] sks, int[] score){
        int total = 0;

        for (int i = 0; i < sks.length; i++) {
            total += sks[i] * score[i];
        }

        return total;
    }

    //Konversi Harkat ke Nilai
    public static int[] convertHarkat(String[] harkat) {
        int[] value = new int[harkat.length];

        for (int i = 0; i < value.length; i++) {
            switch (harkat[i]) {
                case "A":
                    value[i] = 4;
                    break;
                case "B":
                    value[i] = 3;
                    break;
                case "C":
                    value[i] = 2;
                    break;
                case "D":
                    value[i] = 1;
                    break;
                default:
                    value[i] = 0;
                    break;
            }
        }

        return value;
    }

    //Menantukan Yudisium
    public static String getYudisium(boolean isPending, double ipk) {
        String statusYudisium = "";
        if (isPending || ipk < 2.0) {
            statusYudisium = "Pending";
        } else if (ipk >= 3.5) {
            statusYudisium = "Cum Laude";
        } else if (ipk >= 2.75 && ipk < 3.5) {
            statusYudisium = "Sangat Memuaskan";
        } else if (ipk >= 2.0 && ipk < 2.75) {
            statusYudisium = "Memuaskan";
        }
        return statusYudisium;
    }

    //Menghitung IPK
    public static double calculateIpk(double totalSks, double totalScore) {
        double ipk = 0;

        ipk = totalScore/totalSks;

        return ipk;
    }

    //Print Hasil
    public static void printHasil(double ipk, double totalSks, String statusYudisium, String[] arrModule, String[] arrHarkat) {
        int number = 1;

        System.out.println("Yudisium: " + statusYudisium);
        System.out.printf("IPK: %.2f%n", ipk);
        System.out.println("Total SKS: " + totalSks);
        System.out.println("Total Module: " + arrModule.length);
        for (int i = 0; i < arrModule.length; i++) {
            System.out.println((number++) + ". " + arrModule[i] + " (" + arrHarkat[i] + ")");
        }
    }

    //Validasi Pending berdasarkan Nilai Harkat
    public static boolean isPendingValidation(String[] arrHarkat) {
        boolean isPending = false;
        for (String harkat : arrHarkat) {
            if (harkat.equals("E")) {
                isPending = true;
                break;
            }
        }
        return isPending;
    }
}
