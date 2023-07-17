import java.util.Scanner;

public class Array2Dimensi {
    public static void main(String[] args) {

        int[][] arrayInput = new int[4][4];

        inputArray(arrayInput);

        int bilanganGanjil = hitungBilanganGanjil(arrayInput);

        System.out.println(bilanganGanjil);
    }

    public static void inputArray(int[][] arry){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                arry[i][j] = scanner.nextInt();
            }
        }
    }

    public static int hitungBilanganGanjil(int[][] arry){
        int jumlahBilanganGanjil = 0;

        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                if (arry[i][j] % 2 != 0){
                    jumlahBilanganGanjil++;
                }
            }
        }

        return jumlahBilanganGanjil;
    }
}
